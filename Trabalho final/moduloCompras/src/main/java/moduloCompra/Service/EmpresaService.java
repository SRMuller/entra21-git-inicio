package moduloCompra.Service;

import moduloCompra.DTO.EmpresaDTO;
import moduloCompra.entity.EmpresaEntity;
import moduloCompra.rository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpresaService {

    @Autowired
    public static EmpresaRepository empresaRepository;

    public static List<EmpresaDTO> getAll() {
        return empresaRepository.findAll().stream().map((er) -> {
            EmpresaDTO dto = new EmpresaDTO();
            dto.setId(er.getId());
            dto.setCnpj(er.getCnpj());
            return dto;
        }).collect(Collectors.toList());
    }

    public void save(EmpresaDTO imput) {
        EmpresaEntity newEntity = new EmpresaEntity();
        newEntity.setRazao_social(imput.getRazao_social());
        newEntity.setCnpj(imput.getCnpj());
        newEntity.setId_gerente(imput.getId_gerente());
        newEntity.setEndereco(imput.getEndereco());
    }

    public void delete(Long id) {
        empresaRepository.deleteById(id);
    }

    public EmpresaEntity update(Long id, EmpresaEntity empresaEntity) {
        EmpresaEntity updateEmpresa = empresaRepository.findById(id).orElseThrow(() -> new RuntimeException("Empresa não encontrada"));
        updateEmpresa.setRazao_social(empresaEntity.getRazao_social());
        updateEmpresa.setCnpj(empresaEntity.getCnpj());
        updateEmpresa.setEndereco(empresaEntity.getEndereco());
        updateEmpresa.setId_gerente(empresaEntity.getId_gerente());
        return empresaRepository.save(updateEmpresa);
    }
    public EmpresaEntity read(Long id, EmpresaEntity empresaEntity) {
        return empresaRepository.findById(id).orElseThrow(() -> new RuntimeException("Empresa não encontrada"));

}
}
