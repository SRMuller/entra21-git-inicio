import java.util.Scanner;

public class Exercicio2data060522 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a quantidade de linha que deseja:");
        int line = in.nextInt();
        System.out.println("Digite a quantidade de colunas que deseja:");
        int col = in.nextInt();
        String [] [] matriz = new String[line][col];
        for(int i = 0; i < line; i++) {
            for(int j = 0; j < col; j++) {
                matriz [i] [j] = "#";
                System.out.print(matriz [i] [j]);




            }
            System.out.println();
        }
    }
}
