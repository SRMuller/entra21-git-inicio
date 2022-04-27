import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);
        double BASE;
        System.out.println("Digite o valor da base: ");
        BASE = var1.nextDouble();
        Scanner var2 = new Scanner(System.in);
        double ALTURA;
        System.out.println("Digite o valor da altura: ");
        ALTURA = var2.nextDouble();
                System.out.println("Area do retângulo: "+BASE*ALTURA+"m²" );
                System.out.println("Perimetro do retângulo: "+(BASE+BASE+ALTURA+ALTURA)+"m");
    }
}
