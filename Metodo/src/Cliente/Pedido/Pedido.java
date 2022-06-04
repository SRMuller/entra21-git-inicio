package Cliente.Pedido;

import Classes.Lanches.*;

public class Pedido {

    private Lanche[] lanches = new Lanche[10];

    public void ipmimirComanda() {


        for (Lanche l : this.getLanches()) {
            if (l != null) {
                if (l instanceof MiniPizza) {
                    MiniPizza mp = ((MiniPizza) l);
                    System.out.println("===" + l.getTipo() + " - \n" + "====" + ((MiniPizza) l).getSabor() + "====");
                    if (mp.isborda()) {
                        System.out.println("--\n--BORDA RECHEADA --\n--" + mp.getSaborBorda() + "--");
                    }
                    if (l instanceof Pizza) {
                        System.out.println("Tamanho " + ((Pizza) l).getTamanho());
                    }
                } else {
                    System.out.println("====" + l.getTipo() + "====");
                }
                if (l instanceof XBurguer) {
                    if (((XBurguer) l).isAberto()) {
                        System.out.println("--Lanche Aberto--");
                    }
                }
                System.out.printf("Valor : R$%.2f\n", l.getValor());
                System.out.println("-INGREDIENTES-");
                for (String ingredente : l.getIngredientes()) {
                    if (ingredente != null) {
                        System.out.println(ingredente);

                    }
                }


                if (l instanceof Sanduiche) {
                    Sanduiche s = (Sanduiche) l;
                    if (s.getadicionais()[0] != null) {
                        System.out.println("--ADICIONAIS --");
                        for (String adi : s.getadicionais()) {
                            if (adi != null) {
                                System.out.print("--" + adi.toUpperCase() + "--\n");
                            }
                        }
                    }
                }
            }
        }
        System.out.printf("Total apagar: R$%.2f\n",this.calcularVlorTotal());
        System.out.println("______________________________");
    }

    public double calcularVlorTotal() {
        double valortotal = 0;
        for (int i = 0; i < lanches.length; i++) {
            if (lanches[i] != null) {
                valortotal += lanches[i].getValor();
            }
        }
        return valortotal;
    }

    public void adicionarLanche(Lanche lanche) {
        for (int i = 0; i < 10; i++) {
            if (this.lanches[i] == null) {
                this.lanches[i] = lanche;
                break;
            }
        }
    }

    public Lanche[] getLanches() {
        return this.lanches;
    }


    public void setLanches(Lanche[] lanches) {
        this.lanches = lanches;
    }
}




