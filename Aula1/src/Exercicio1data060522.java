import java.util.Scanner;

public class Exercicio1data060522 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = in.nextLine();
        int espacos = 0;
        for (int i=0; i < frase.length(); i++ ) {
            if (frase.charAt(i) == ' ') {
                espacos ++;
            }
        }

            System.out.println(espacos);

        }
    }

