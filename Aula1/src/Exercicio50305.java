import java.util.Scanner;

public class Exercicio50305 {
    public static void main(String[] args) {
        Scanner qunt = new Scanner(System.in);
        System.out.println("Quantas palavras vc quer informar?");
        int palavras = qunt.nextInt();
        String[] pal = new String[palavras];

        for (int i = 0; i < palavras; i++) {
            System.out.println("Informe um palavra");
            pal[i] = qunt.next();
        }
        String fim = " ";
        for (int j = 0; j < pal.length; j++) {
            if (j == 0) {
                fim += pal[j];
            } else {
                fim += ", " + pal[j];
            }
        }
        System.out.println(fim);
    }
}
