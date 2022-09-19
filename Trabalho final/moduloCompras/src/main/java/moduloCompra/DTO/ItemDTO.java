package moduloCompra.DTO;


import lombok.Data;

@Data
public class ItemDTO {

    private Long idItem;

    private String descricao;

    private String unidadeMedida;

    private boolean ativo;


}
