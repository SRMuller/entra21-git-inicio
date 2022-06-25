import Classes.Lanches.*;
import Cliente.cliente;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        cliente cl = new cliente();
        System.out.println("Insira o nome do cliente");
        cl.setNome(in.nextLine());
        while (true){
            System.out.println("Deseja mais um lanche S/N");
            if (in.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
        System.out.println("Cliente:" + cl.getNome());
        cl.getPedido().ipmimirComanda();
    }

    private static Lanche montarLanche() {
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
            case 6:
                lanche = new Pizza();
                break;
            default:
                System.err.println("Escolha uma opção válida:");
        }
        if (lanche instanceof Sanduiche) {
            if (lanche instanceof XBurguer) {
                System.out.println("Deseja Aberto S/N");
                in.nextLine();
                String aberto = in.next();
                ((XBurguer) lanche).isAberto();
                for (int j = 0; j < 10; j++) {
                    System.out.println("Informe o adicional");
                    String nomeadicional=in.nextLine();
                    System.out.println("Informe o valor do adicional");
                    lanche.adicionarAdicionais(nomeadicional, in.nextDouble());
                    System.out.println("Deseja adicionar mais um intem? S/N");
                    String s = in.nextLine();
                    if (s.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            }
        }
        if (lanche instanceof MiniPizza) {
            System.out.println("Deseja com ou sem borda C/S");
            in.nextLine();
            String borda = in.next();
            MiniPizza minipizza = ((MiniPizza) lanche);
            minipizza.setborda(borda.equalsIgnoreCase("C"));
            if (minipizza.isborda()) {
                System.out.println("Informe o sabor da Borda:");
                in.nextLine();
                minipizza.setSabor(in.nextLine());
            }
        }
        if (lanche instanceof Pizza) {
            System.out.println("Escolha o Tamanho");
            System.out.println("XS - Broto");
            System.out.println("SM - Pequena");
            System.out.println("MD - Media");
            System.out.println("LG - Grande");
            System.out.println("XL - Familia");
            ((Pizza) lanche).setTamanho(in.nextLine().toUpperCase());
            System.out.println("Escolha o sabor da pizza");
            System.out.println("(1) 4 Queijos");
            System.out.println("(2) Calabresa");
            System.out.println("(3) Frago/catupiry");
            System.out.println("(4) Marguerita");
            System.out.println("(5) Portuguesa");
            int sabor = in.nextInt();
            in.nextLine();
            MiniPizza miniPizza = ((MiniPizza) lanche);
            switch (sabor) {
                case 1:
                    miniPizza.adicionarIngrediente("4 queijos");
                case 2:
                    miniPizza.adicionarIngrediente("Calabresa");
                case 3:
                    miniPizza.adicionarIngrediente("Frango/catupiry");
                case 4:
                    miniPizza.adicionarIngrediente("Marguerita");
                case 5:
                    miniPizza.adicionarIngrediente("Portuguesa");
            }
        }

        System.out.println("Informe o valor do lanche:");
        lanche.setValor(in.nextDouble());
        return lanche;
    }
}
