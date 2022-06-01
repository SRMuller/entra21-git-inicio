import Classes.Lanches.*;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Iforme\n1 para XSalada\n2 para XBurguer\n3 para Hot Dog\n4 para Misto Quente\n5 para Mini Pizza\n6 para Pizza");
        int escolha = in.nextInt();
        Lanche lanche = null;

        switch (escolha) {
            case 1:
                lanche = new XSalada();
                break;
            case 2:
                lanche = new XBurguer();
                break;
            case 3:
                lanche = new HotDog();
                break;
            case 4:
                lanche = new MistoQuente();
                break;
            case 5:
                lanche = new MiniPizza();
                break;
            default:
                System.err.println("Escolha uma opção válida:");
        }
        if (lanche instanceof Sanduiche){
            if (lanche instanceof XBurguer) {
                System.out.println("Deseja Aberto S/N");
                in.nextLine();
                String aberto = in.next();
                ((XBurguer) lanche).aberto = aberto.equalsIgnoreCase("S");
                for (int j = 0; j < 10; j++){
                    System.out.println("Informe o adicional");
                    in.nextLine();
                    ((Sanduiche)lanche).adicionarAdicionais(in.nextLine());
                    System.out.println("Deseja adicionar mais um intem? S/N");
                    String s = in.nextLine();
                    if(s.equalsIgnoreCase("n")){
                        break;
                    }}}

            else {
                System.out.println("Deseja com ou sem borda C/S");
                in.nextLine();
                String borda = in.next();
                MiniPizza minipizza = ((MiniPizza) lanche);
                (minipizza).borda = borda.equalsIgnoreCase("c");
                if (minipizza.borda) {
                    System.out.println("Informe o sabor da Borda:");
                    in.nextLine();
                    (minipizza).sabor = in.nextLine();
                }





            }
        }
        System.out.println("Informe o valor do lanche:");
        lanche.valor = in.nextDouble();
        lanche.montarComanda();
    }
}