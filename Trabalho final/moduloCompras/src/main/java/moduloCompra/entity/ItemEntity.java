package moduloCompra.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "item")
public class ItemEntity {

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "unidadeMedida")
    private String unidadeMedida;

    @Column(name = "ativo")
    private Boolean ativo;


}
