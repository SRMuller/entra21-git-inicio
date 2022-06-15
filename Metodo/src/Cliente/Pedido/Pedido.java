package Cliente.Pedido;

import Classes.Lanches.*;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<Lanche> lanches = new ArrayList<>();

    public void ipmimirComanda() {


        for (Lanche l : this.getLanches()) {

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



                if (l instanceof Sanduiche) {
                    Sanduiche s = (Sanduiche) l;
                    System.out.println("--ADICIONAIS --");
                        for (String adi : s.getadicionais()) {
                                System.out.print("--" + adi.toUpperCase() + "--\n");
                            }
                        }

                }
            }

        System.out.printf("Total apagar: R$%.2f\n",this.calcularVlorTotal());
        System.out.println("______________________________");
    }

    public double calcularVlorTotal() {
        double valortotal = 0;
        for (int i = 0; i < lanches.size(); i++) {

                valortotal += lanches.get(i).getValor();

        }
        return valortotal;
    }

    public void adicionarLanche(Lanche lanche) {
     this.lanches.add(lanche);
        }


    public ArrayList<Lanche> getLanches() {
        return this.lanches;
    }




}




