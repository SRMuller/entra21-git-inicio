package moduloCompra.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "ordem_compra_item")
public class Ordem_Compra_ItemEntity {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "quantidade")
    private Double quantidade;

    @ManyToOne
    @JoinColumn(name = "id_OC", referencedColumnName = "id")
    private Ordem_CompraEntity id_OC;

    @ManyToOne
    @JoinColumn(name = "id_item", referencedColumnName = "id")
    private ItemEntity id_item;

    @OneToMany(mappedBy = "idOCItem")
    private List<OrdemCompraItemCoEntity> cotacoes;

}
