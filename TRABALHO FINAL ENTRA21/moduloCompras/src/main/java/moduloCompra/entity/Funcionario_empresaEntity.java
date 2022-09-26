package moduloCompra.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "funcionario_empresa")
public class Funcionario_empresaEntity {

    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_empresa", referencedColumnName = "id")
    private EmpresaEntity empresa;

    @ManyToOne
    @JoinColumn(name = "id_pessoa", referencedColumnName = "id")
    private PessoaEntity id_pessoa;

    @Column(name = "ativo")
    private boolean ativo;

}
