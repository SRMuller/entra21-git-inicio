package moduloCompra.DTO;


import lombok.Data;

@Data
public class PessoaDTO {

    private Long id;

    private String nome;

    private String sobrenome;

    private String telefone;

    private String cpf;

    private String login;

    private String senha;
}
