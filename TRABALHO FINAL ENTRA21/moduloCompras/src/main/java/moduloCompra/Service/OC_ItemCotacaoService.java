package moduloCompra.Service;


import moduloCompra.DTO.CotacaoFornecedorDTO;
import moduloCompra.DTO.OrdemCompraItemCotDTO;
import moduloCompra.entity.EmpresaEntity;
import moduloCompra.entity.OrdemCompraItemCoEntity;
import moduloCompra.rository.EmpresaRepository;
import moduloCompra.rository.OrdeCompraItemRepository;
import moduloCompra.rository.OrdemCompraItemCotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OC_ItemCotacaoService {

    @Autowired
    private OrdemCompraItemCotRepository ordemCompraItemCotRepository;

    @Autowired
    private EmpresaRepository empresaRepository;

    @Autowired
    private OrdeCompraItemRepository ordeCompraItemRepository;



    public List<OrdemCompraItemCotDTO> getAll(){
        return ordemCompraItemCotRepository.findAll().stream().map((oc)->{
            OrdemCompraItemCotDTO dto = new OrdemCompraItemCotDTO();
            dto.setId(oc.getId());
            dto.setValor(oc.getValor());
            dto.setEscolhido(oc.getEscolhido());
            dto.setOrdemItemCompra(oc.getIdOCItem().getId());
            dto.setIdFornecedor(oc.getIdFornecedor().getId());
            return dto;
        }).collect(Collectors.toList());

    }
    public List<CotacaoFornecedorDTO> findById(Long id) {
        return ordemCompraItemCotRepository.findAll().stream().map((cf) -> {
            CotacaoFornecedorDTO dto = new CotacaoFornecedorDTO();
            dto.setIdFornecedor(cf.getIdFornecedor().getId());
            dto.setValorUnitario(cf.getValor());
            dto.setDescricao(cf.getIdOCItem().getId_item().getDescricao());
            dto.setQuantidade(cf.getIdOCItem().getQuantidade());
            dto.setValorTotal(cf.getValor() * dto.getQuantidade());
            return dto;
        }).collect(Collectors.toList());
    }

   public OrdemCompraItemCoEntity update(Long id, OrdemCompraItemCoEntity ordemCompraItemCoEntity ){
        OrdemCompraItemCoEntity updateOrdemCompraItemCotacao = ordemCompraItemCotRepository.findById(id).orElseThrow(()-> new RuntimeException("Cotação não encontrada"));
        updateOrdemCompraItemCotacao.setEscolhido(ordemCompraItemCoEntity.getEscolhido());
        return ordemCompraItemCotRepository.save(updateOrdemCompraItemCotacao);
    }
    public void save (CotacaoFornecedorDTO input){
        OrdemCompraItemCoEntity newEntity = new OrdemCompraItemCoEntity();
        newEntity.setIdFornecedor(empresaRepository.findById(input.getIdFornecedor()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
        newEntity.setIdOCItem(ordeCompraItemRepository.findById(input.getIdOrdemCompraItem()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
        newEntity.setValor(input.getValorUnitario());


    }



}
