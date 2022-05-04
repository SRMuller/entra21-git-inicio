import java.util.Scanner;

public class Lista2Exer4 {

    public static void main(String[] args) {

        int ano;
        Scanner nasc = new Scanner(System.in);
        System.out.println("Digete seu ano de nascimento :");
        ano = nasc.nextInt();
        int voto = 2022 - ano;

        if ( voto >= 16){
            System.out.println("Parabéns você já esta apto a votar!!!");
        }
        else {
            System.out.println("Sinto muito você ainda ñ poderá votar");
        }
    }
}
