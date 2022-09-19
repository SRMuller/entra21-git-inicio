package moduloCompra.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaListDTO {
    private Long id;

    private String nome;

    private String sobrenome;

    private String telefone;

    private String cpf;


}
