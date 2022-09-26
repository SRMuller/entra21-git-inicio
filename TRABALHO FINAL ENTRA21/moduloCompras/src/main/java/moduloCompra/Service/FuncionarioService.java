package moduloCompra.Service;


import moduloCompra.DTO.FuncionarioEmpresaDTO;
import moduloCompra.rository.FuncionarioEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FuncionarioService {

    @Autowired
    public  static FuncionarioEmpresaRepository funcionarioEmpresaRepository;

    public  static List<FuncionarioEmpresaDTO> getAll(){
        return funcionarioEmpresaRepository.findAll().stream().map((fu)->{
            FuncionarioEmpresaDTO dto = new FuncionarioEmpresaDTO();
            dto.setId(fu.getId());
            dto.setAtivo(fu.isAtivo());
            dto.setId_empresa(fu.getEmpresa().getId());
            return dto;
        }).collect(Collectors.toList());
    }
}
