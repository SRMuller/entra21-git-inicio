import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        double f;
        Scanner fahreneit =new Scanner(System.in);
        System.out.print("informe a temperatura em fahrenheit: ");
        f = fahreneit.nextDouble();
        double c;
        c = ((f - 32)/9)*5;
        System.out.printf("A temperatura em celsius é: %.2dº",c);

    }
}
