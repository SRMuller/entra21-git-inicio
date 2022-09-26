package moduloCompra.Service;


import moduloCompra.DTO.FornecedorDTO;
import moduloCompra.rository.Fornecedor_EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FornecedorService {
    @Autowired
    public static Fornecedor_EmpresaRepository fornecedor_empresaRepository;

    public static List<FornecedorDTO> getAll() {
        return fornecedor_empresaRepository.findAll().stream().map((fe) -> {
            FornecedorDTO dto = new FornecedorDTO();
            dto.setId(fe.getId());
            return dto;

        }).collect(Collectors.toList());
    }
}
