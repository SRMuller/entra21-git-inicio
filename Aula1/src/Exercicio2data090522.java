import java.text.BreakIterator;
import java.util.Scanner;

public class Exercicio2data090522 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a senha ocm 5 caracteres:");
        int a = in.nextInt();
        int b = 3;
        int c = 0;
        for (int i = 0; i < 2; i++) {
            if (a == 91352) {
                System.out.println("Bem vindo");
                break;
            } else {
                b--;
                System.out.println("Senha incorreta digite novamente "+ b +" tentativas restantes");
                a = in.nextInt();
                c++;
            }
            if (c == 2){
                System.out.println("Acesso Bloqueado");
            }

        }

    }
}





