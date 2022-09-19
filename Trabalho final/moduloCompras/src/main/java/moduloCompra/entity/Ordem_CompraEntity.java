package moduloCompra.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ordem_compra")
public class Ordem_CompraEntity {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_orcamento", referencedColumnName = "id")
    private ItemEntity id_orcamento;

    @ManyToOne
    @JoinColumn(name = "id_empresa", referencedColumnName = "id")
    private EmpresaEntity id_empresa;


}
