package Cliente.Pedido;

import Classes.Lanches.Lanche;

public class Pedido {

    private Lanche[] lanches = new Lanche[10];

    public void ipmimirComanda(){

    }
    public double calcularVlorTotal(){
        return 0;
    }
    public void adicionarLanche(Lanche lanche) {
        for (int i = 0; i < 10; i++) {
            if (this.lanches[i] == null) {
                this.lanches[i] = lanche;
                break;
}
        }
    }
    public Lanche[] getLanches(){
        return this.lanches;
    }
}
