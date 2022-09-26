package moduloCompra.DTO;


import lombok.Data;

@Data
public class CotacaoFornecedorDTO {

    private Long idFornecedor;

    private Long idOrdemCompraItem;

    private String descricao;

    private Double quantidade;

    private Double valorUnitario;

    private Double valorTotal;





}
