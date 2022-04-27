import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner sal = new Scanner(System.in);
        double salario ;
        System.out.print("Informe os rendiementos: R$");
        salario = sal.nextDouble();
        Scanner rea = new Scanner(System.in);
        double reajuste;
        System.out.println("Informe o percentual de reajuste: ");
        reajuste = rea.nextDouble();
        double pr;
        pr = 100+reajuste;
        double nv;
        nv = salario/100*pr;
        System.out.printf("O salário reajustado é: R$%.2f ",nv);

    }
}
