import java.util.Scanner;

public class Lista2Exer9 {

    public static void main(String[] args) {

        String str1 ="M";
        String Str2 ="F";
        System.out.print("Nome: ");
        Scanner genero = new Scanner(System.in);
        System.out.println("Informe (M/F) para gênero:");
        String sexo = genero.nextLine();
        Scanner altura = new Scanner(System.in);
        System.out.print("Informe sua altura:");
        double atl = altura.nextDouble();
        Scanner massa = new Scanner(System.in);
        System.out.print("Informe seu peso: ");
        double peso = massa.nextDouble();

        if (sexo == str1  ){
            System.out.printf("Seu peso ideal é %.2f ", (72.7 * atl-58));

        }
        else {
            System.out.printf("Seu peso ideal é: %.2f", (62.1 * atl - 44.7));
        }
    }
}

