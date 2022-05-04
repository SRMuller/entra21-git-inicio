import java.util.Scanner;

public class Lista2Exer3 {
    public static void main(String[] args) {

        double Quant;
        Scanner Macas = new Scanner(System.in);
        System.out.println("Informe a quantidade de maças: ");
        Quant = Macas.nextInt();
        if (Quant < 12){
            System.out.println("O valor a pagar é: R$"+(Quant * 1.30));
        }
        else {
            System.out.println("O valor a pagar é: R$"+ (Quant * 1.00) );
        }
    }

}
