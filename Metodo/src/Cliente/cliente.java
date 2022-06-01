package Cliente;

import Cliente.Pedido.Pedido;

public class cliente {


    private String nome;

    private Pedido pedido;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public cliente(){
        this.setPedido(new Pedido());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
