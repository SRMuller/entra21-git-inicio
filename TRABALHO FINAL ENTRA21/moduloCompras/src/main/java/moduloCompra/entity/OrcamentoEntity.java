package moduloCompra.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "orcamento")
public class OrcamentoEntity {

    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "descricao", referencedColumnName = "descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_empresa", referencedColumnName = "id")
    private Long id_empresa;




}
