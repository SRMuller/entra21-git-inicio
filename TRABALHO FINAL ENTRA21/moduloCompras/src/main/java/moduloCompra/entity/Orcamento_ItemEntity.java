package moduloCompra.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "orcamento_item")
public class Orcamento_ItemEntity {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "valor_maximo")
    private Double valueMax;

    @ManyToOne
    @JoinColumn(name = "id_orcamento", referencedColumnName = "id")
    private OrcamentoEntity id_orcamneto;

    @ManyToOne
    @JoinColumn(name = "id_item", referencedColumnName = "id")
    private ItemEntity id_item;
}
