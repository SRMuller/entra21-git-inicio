import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        int constanteano = 2022;
        Scanner texto = new Scanner(System.in);
        int ANOS;
        System.out.println("Digite o ano em que vc nasceu: ");
        ANOS = texto.nextInt();
        ANOS = constanteano - ANOS;
        Scanner texto1 = new Scanner(System.in);
        int MESES;
        System.out.println("Digite o mes em que nasceu: ");
        MESES = texto1.nextInt();
        int DIAS;
        Scanner texto2 = new Scanner(System.in);
        System.out.println("Digite o dia em que você nasceu: ");
        DIAS = texto2.nextInt();
        System.out.println("Você já viveu por incríveis "+(ANOS*365+MESES*30+DIAS) );

    }

}
