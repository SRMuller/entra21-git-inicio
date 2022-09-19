package moduloCompra.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "fornecedores_empresa")
public class FornecedorEntity {

    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ativo")
    private boolean ativo;

    @ManyToOne
    @JoinColumn(name = "id_empresa", referencedColumnName = "id")
    private EmpresaEntity id_empresa;

    @ManyToOne
    @JoinColumn(name = "id_fornecedor", referencedColumnName = "id")
    private EmpresaEntity id_orcamento;



    }
