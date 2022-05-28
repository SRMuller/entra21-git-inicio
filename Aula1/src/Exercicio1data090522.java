import java.util.Scanner;

public class Exercicio1data090522 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int a = in.nextInt();
        int b = 1;
               for (int i = a; i > 0; i++){
          b *= i;
        }
        System.out.println(b);
    }
}
