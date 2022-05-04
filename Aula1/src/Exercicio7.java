import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        double cf;
        double pd;
        double imp;
        Scanner custo1 = new Scanner(System.in);
        System.out.print("Informe o custo de fabricação:\n R$");
        cf = custo1.nextDouble();
        Scanner percent = new Scanner(System.in);
        System.out.print("Informe o percentual  da distribuidora: ");
        pd = percent.nextDouble();
        Scanner impostos = new Scanner(System.in);
        System.out.print("Informe o percentual de impostos:");
        imp = impostos.nextDouble();
        double vt;
        vt = cf/100*(100+pd)/100*(100+imp);
        System.out.printf("O valor do veículo é:\n R$%.2f", vt);

    }
}
