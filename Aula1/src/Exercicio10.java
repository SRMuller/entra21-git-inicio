import javax.swing.*;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {


        double nota1;
        double nota2;
        double nota3;
        Scanner prinota = new Scanner(System.in);
        System.out.print("Digite a 1ª nota: ");
        nota1 = prinota.nextDouble();
        Scanner segnota = new Scanner(System.in);
        System.out.print("Digite a 2ª nota: ");
        nota2 = segnota.nextDouble();
        Scanner ternota = new Scanner(System.in);
        System.out.print("Digite a 3ª nota: ");
        nota3 = ternota.nextDouble();
        double vn1 = nota1*2;
        double vn2 = nota2*3;
        double vn3 = nota3*5;
        double media = (vn1+vn2+vn3)/10;
        System.out.println("A média do aluno é: "+media);
        if (media >= 7) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");

        }


    }
}
