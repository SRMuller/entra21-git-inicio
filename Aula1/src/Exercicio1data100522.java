import java.util.Scanner;

public class Exercicio1data100522 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um nome");
        String a = in.nextLine();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                System.out.print(a.charAt(0) + ". " + a.charAt(i + 1)+".");
            }

        }
    }
}
        