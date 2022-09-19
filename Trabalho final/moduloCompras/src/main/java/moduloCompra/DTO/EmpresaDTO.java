package moduloCompra.DTO;


import lombok.Data;

@Data
public class EmpresaDTO {

    private Long id;

    private String razao_social;

    private String cnpj;

    private String endereco;

    private Long id_gerente;
}
