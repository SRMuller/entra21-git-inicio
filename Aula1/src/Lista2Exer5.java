import java.util.Scanner;

public class Lista2Exer5 {

    public static void main(String[] args) {

        int num1;
        int num2;
        Scanner va1 = new Scanner(System.in);
        System.out.print("Digite um número:");
        num1 = va1.nextInt();
        Scanner var2 = new Scanner(System.in);
        System.out.println("Digite o segundo número ");
        num2 = var2.nextInt();
        if (num1 > num2){
            System.out.println(num1+" é o maior.");
        } else if (num1 < num2) {
            System.out.println(num2 + " é o maior.");
        }
    }
}
