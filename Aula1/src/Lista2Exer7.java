import java.util.Scanner;

public class Lista2Exer7 {

    public static void main(String[] args) {

        Scanner hora1 = new Scanner(System.in);
        System.out.println("Informe o horário de inicio do jogo:");
        int inic = hora1.nextInt();
        Scanner hora2 = new Scanner(System.in);
        System.out.println("informe a hora de término:");
        int fim = hora2.nextInt();
        if (inic < fim){
            System.out.print("Tempo de duração:"+ (fim - inic)+"hs");

        }
        else {
            System.out.println("Tempo de duração:"+ (24 - inic + fim)+"hs");
        }

    }
}
