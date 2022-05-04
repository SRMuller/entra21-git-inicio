import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        double fixo;
        int qcv;
        double comfx;
        double tv;
        Scanner salfix = new Scanner(System.in);
        System.out.print("\nInforme o slário fixo:\nR$");
        fixo = salfix.nextDouble();
        Scanner total = new Scanner(System.in);
        System.out.print("\nInforme o número de carros vendidos:");
        qcv = total.nextInt();
        Scanner comfixa = new Scanner(System.in);
        System.out.print("\nInforme o valor do premio por unidade vendia:\nR$");
        comfx = comfixa.nextDouble();
        Scanner totalvendas = new Scanner(System.in);
        System.out.print("\nInforme o valor total das vendas:\nR$");
        tv = totalvendas.nextDouble();
        double salario;
        double comvar;
        comvar = 100/tv*105;
        salario = fixo+qcv*comfx+comvar;
        System.out.print("\nTotal de vencimentos: R$"+salario);
    }
}
