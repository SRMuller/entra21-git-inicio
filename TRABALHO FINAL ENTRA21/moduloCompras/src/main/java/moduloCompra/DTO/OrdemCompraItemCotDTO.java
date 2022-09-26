package moduloCompra.DTO;


import lombok.Data;

@Data
public class OrdemCompraItemCotDTO {

    private Long id;

    private Double valor;

    private Boolean escolhido;

    private Long idFornecedor;

    private Long ordemItemCompra;

}
