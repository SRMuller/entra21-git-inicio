import java.util.Scanner;

public class Lista2Exer2 {
    public static void main(String[] args) {
        int num;
        Scanner numero = new Scanner(System.in);
        System.out.print("Digete um número:");
        num = numero.nextInt();
        if (num >= 0){
            System.out.println("É positivo!");
        }
        else {
            System.out.println("É negativo!");
        }
    }
}



