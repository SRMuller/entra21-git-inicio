package moduloCompra.Service;


import moduloCompra.DTO.PessoaDTO;
import moduloCompra.DTO.PessoaListDTO;
import moduloCompra.entity.PessoaEntity;
import moduloCompra.rository.PessoaListRepository;
import moduloCompra.rository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PessoaService {

    @Autowired
    private static PessoaRepository pessoaRepository;
    @Autowired
    private static PessoaListRepository pessoaListRepository;

    public static List<PessoaListDTO> getAll(){

        return pessoaRepository.findAll().stream().map((pr) ->{
            PessoaListDTO dto =new PessoaListDTO();
           dto.setId(pr.getId());
           dto.setNome(pr.getNome());
           dto.setSobrenome(pr.getSobrenome());
           dto.setCpf(pr.getCpf());
           dto.setTelefone(pr.getTelefone());

                        return dto;

        }).collect(Collectors.toList());
    }
    public void save(PessoaDTO imput){
        PessoaEntity newEntity = new PessoaEntity();
        newEntity.setNome(imput.getNome());
        newEntity.setSobrenome(imput.getSobrenome());
        newEntity.setTelefone(imput.getTelefone());
        newEntity.setCpf(imput.getCpf());
        newEntity.setLogin(imput.getLogin() );
        newEntity.setSenha(imput.getSenha());

    }
    public void delete(Long id){
        pessoaRepository.deleteById(id);
    }


    public PessoaEntity update(Long id, PessoaEntity pessoaEntity){
        PessoaEntity updatePessoa = pessoaRepository.findById(id).orElseThrow(()->new RuntimeException("Pessoa não encontrada"));
        updatePessoa.setNome(pessoaEntity.getNome());
        updatePessoa.setSobrenome(pessoaEntity.getSobrenome());
        updatePessoa.setTelefone(pessoaEntity.getTelefone());
        updatePessoa.setCpf(pessoaEntity.getCpf());
        return pessoaRepository.save(updatePessoa);
    }
    public PessoaEntity read(Long id, PessoaEntity pessoaEntity){
        return pessoaRepository.findById(id).orElseThrow(()->new RuntimeException("Pessoa não encontrada"));

}
}
