import java.util.Scanner;

public class Exercicio3data060522 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  soma = 0;
        for (int i = 0; i < 5; i ++){
            System.out.println("Digite o inteiro:");
            soma += in.nextInt();

        }
        System.out.print("A some é" + soma);
    }
}