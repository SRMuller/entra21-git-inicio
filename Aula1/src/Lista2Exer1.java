import java.util.Scanner;

public class Lista2Exer1 {

    public static void main(String[] args) {

        int num;
        Scanner numero = new Scanner(System.in);
        System.out.print("Digete um número:");
        num = numero.nextInt();
        if (num > 10){
            System.out.println("É maior que 10!");
        }
        else {
            System.out.println("Não é maior que 10!");
        }
    }
}
