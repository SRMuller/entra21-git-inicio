import java.util.Scanner;

public class Exercicio3data090522 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Infore um número:");
        int a = in.nextInt();
        int b = a-1;
        int c = a;
        for (int i = 0; i < a; i++ ){
            c = c + b--;
        }
        System.out.println(c);
    }
}
