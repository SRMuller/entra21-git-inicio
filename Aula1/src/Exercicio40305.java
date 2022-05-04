import java.util.Scanner;

public class Exercicio40305 {
    public static void main(String[] args) {
        Scanner tab = new Scanner(System.in);
        System.out.println("Qual a tabuada deseja saber?");
        int valor = tab.nextInt();
        while (valor != 0){
        for (int num = 0; num <= 10; num++) {
            System.out.println(num * valor);
        }
        System.out.println("Qual a tabuada deseja saber?");
            valor= tab.nextInt();

            }

        }



}
