package moduloCompra.Service;


import moduloCompra.DTO.OrcamentoDTO;
import moduloCompra.entity.OrcamentoEntity;
import moduloCompra.rository.OrcamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrcamentoService {


    @Autowired
    private static OrcamentoRepository orcamentoRepository;

    public static List<OrcamentoDTO> getAll(){
        return orcamentoRepository.findAll().stream().map((or) ->{
            OrcamentoDTO dto = new OrcamentoDTO();
            dto.setId(or.getId());
            dto.setId_item(or.getId_item());
            dto.setQuantidade(or.getQuantidade());
            dto.setValor(or.getValor());
            return dto;
        }).collect(Collectors.toList());
    }
    public void save(OrcamentoDTO imput){
        OrcamentoEntity newEntity = new OrcamentoEntity();
        newEntity.setId_item(imput.getId_item());
        newEntity.setQuantidade(imput.getQuantidade());
        newEntity.setValor(imput.getValor());
    }

    public void delete(Long id){orcamentoRepository.deleteById(id);}

    public  OrcamentoEntity update(Long id, OrcamentoEntity orcamentoEntity){
        OrcamentoEntity updateOrcamento = orcamentoRepository.findById(id).orElseThrow(()->new RuntimeException("Orçamento não encontrado"));
        updateOrcamento.setValor(orcamentoEntity.getValor());
        updateOrcamento.setQuantidade(orcamentoEntity.getQuantidade());
        return orcamentoRepository.save(updateOrcamento);
        }

    public OrcamentoEntity read(Long id, OrcamentoEntity orcamentoEntity){
        return orcamentoRepository.findById(id).orElseThrow(()-> new RuntimeException("Orçamento não encontrado"));
    }
    }

