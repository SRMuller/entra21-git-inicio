import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Double> produtos = new HashMap<>();
        boolean executar = true;
        while (executar) {
            System.out.println("Menu");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto");
            System.out.println("3 - mOSTRAR LISTA DE PRODUTOS");
            System.out.println("4 - REMOVER PRODUTOS");
            System.out.println("0 - Sair");
            int escolha = in.nextInt();
            in.nextLine();
            switch (escolha) {
                case 0:
                    executar = false;
                case 1:
                    System.out.println("INFORME O PRODUTO:");
                    String chave = in.nextLine().toLowerCase(Locale.ROOT);
                    if (produtos.containsKey(chave)) {
                        System.out.println("PRODUTO JÁ EXISTE DESEJA ALTERAR VALOR S/N");
                        if (in.nextLine().equalsIgnoreCase("N")) {
                            continue;
                        }
                    }
                    System.out.println("IFORME O VALOR:");
                    double valor = in.nextDouble();
                    produtos.put(chave, valor);
                    break;

                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("NÃO HÁ PRODUTOS");
                    } else {
                        System.out.println("INFORMR O PRODUTO");
                        String busca = in.nextLine().toLowerCase(Locale.ROOT);
                        if (produtos.containsKey(busca)) {
                            System.out.println(busca + " : " + produtos.get(busca));
                        } else {
                            System.out.println("PRODUTO " + busca + "NÃO ENCONTRADO");
                        }
                    }
                case 3:
                    System.out.println(produtos);
                case 4:
                    if (produtos.isEmpty()) {
                        System.out.println("NÃO HÁ PRODUTOS");
                    } else {
                        System.out.println("INFORMR O PRODUTO");
                        String busca = in.nextLine().toLowerCase(Locale.ROOT);
                        if (produtos.containsKey(busca)) {
                            produtos.remove(busca);

                        }
                    }
            }
        }
    }
}