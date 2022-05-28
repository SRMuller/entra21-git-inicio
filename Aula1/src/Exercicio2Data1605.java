import java.util.Scanner;

public class Exercicio2Data1605 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maior = 0, menor = 0;
        int parada = -1;
        boolean primeiro = true;
        while (parada != 0){
            System.out.println("Informe um número (0 para sair)");
            parada = in.nextInt();
            if (parada == 0){
                break;
            }
            if (primeiro){
                menor = parada;
                maior = parada;
                primeiro = false;
            }else {
                if (parada < maior){
                    maior = parada;
                }
                if (parada > menor){
                    menor = parada;
                }

            }
        } System.out.println("O menor numero foi  "+ menor + "\nO maior numero foi  "+ maior);
    }
}
