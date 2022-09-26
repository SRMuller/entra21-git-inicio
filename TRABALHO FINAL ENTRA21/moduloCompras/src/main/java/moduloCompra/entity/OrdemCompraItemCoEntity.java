package moduloCompra.entity;


import jdk.jfr.Enabled;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ordemCompraCotacao")
public class OrdemCompraItemCoEntity {

    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "valor")
    private Double valor;

    @Column(name = "escolhido")
    private Boolean escolhido;

    @ManyToOne
    @JoinColumn(name = "id_ordem_Compra_Item", referencedColumnName = "id")
    private Ordem_Compra_ItemEntity idOCItem;

    @ManyToOne
    @JoinColumn(name = "id_Fornecedor", referencedColumnName = "id")
    private EmpresaEntity idFornecedor;




}
