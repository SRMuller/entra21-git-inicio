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

    public static List<OrcamentoDTO> getAll() {
        return orcamentoRepository.findAll().stream().map((or) -> {
            OrcamentoDTO dto = new OrcamentoDTO();
            dto.setId(or.getId());
            dto.setDescricao(or.getDescricao());
            dto.setId_empresa(or.getId_empresa());
            return dto;
        }).collect(Collectors.toList());
    }

    public void save(OrcamentoDTO imput) {
        OrcamentoEntity newEntity = new OrcamentoEntity();
        newEntity.setDescricao(imput.getDescricao());
        newEntity.setId_empresa(imput.getId_empresa());

    }

    public void delete(Long id) {
        orcamentoRepository.deleteById(id);
    }


    public OrcamentoEntity read(Long id, OrcamentoEntity orcamentoEntity) {
        return orcamentoRepository.findById(id).orElseThrow(() -> new RuntimeException("Orçamento não encontrado"));
    }
}

