import java.util.Scanner;

public class Lista2Exer8 {

    public static void main(String[] args) {
        Scanner horas1 = new Scanner(System.in);
        System.out.print("Informe a quantidade de horas trabalhadas na 1ª semana:");
        int total1 = horas1.nextInt();

        Scanner horas2 = new Scanner(System.in);
        System.out.print("Informe a quantidade de horas trabalhadas na 2ª semana:");
        int total2 = horas2.nextInt();

        Scanner horas3 = new Scanner(System.in);
        System.out.print("Informe a quantidade de horas trabalhadas na 3ª semana:");
        int total3 = horas3.nextInt();

        Scanner horas4 = new Scanner(System.in);
        System.out.print("Informe a quantidade de horas trabalhadas na 4ª semana:");
        int total4 = horas4.nextInt();

        Scanner salario = new Scanner(System.in);
        System.out.print("Informe o valor hora:");
        double valorhora = salario.nextInt();

        int totaldehoras = total1 + total2 + total3 + total4;

                if (totaldehoras <= 160){
            System.out.println("O valor s receber é de: R$"+totaldehoras * valorhora);
        }
                else {
            System.out.printf("O valor s receber é de: R$ %.2f ", (valorhora * 1.5) * (totaldehoras - 160 ) + (160 * valorhora));
        }

    }
}
