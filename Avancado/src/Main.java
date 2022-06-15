import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        ex3();

    }
    public  static void ex1(){
        /* Pedir pro usuario informar n numeros inteiros até ele digitar 0
        quando ele digitar 0, mostrar a lista dos numeros digitados por ele     */
        ArrayList<Object> inteiros = new ArrayList<>();
        while (true){
        System.out.println("digite um numero inteiro");
        int escolha = in.nextInt();
        inteiros.add(escolha);
        if (escolha == 0){
            break;
        }
            System.out.println("Valores infirmados:");

                     System.out.println(inteiros);
            }

    }
    public static void ex2(){
        ArrayList<Integer> inteiros = new ArrayList<>();
        double np = 0;
        double ni = 0 ;
        while (true){
            System.out.println("digite um numero inteiro");
            int escolha = in.nextInt();
            inteiros.add(escolha);
            if (escolha == 0){
                break;
    }
            int b = 2;
            for (int i = 0; i < inteiros.size(); i ++){
            int c = inteiros.get(i) % b;
            if (c == 0 ){
                np += inteiros.get(i);
            }else{
                ni += inteiros.get(i);
            }
          }
        }
            System.out.println("Os numeror pares somam"+np);
            System.out.println("Os numeror impares somam"+ni);
            System.out.println("A media dos numeros digitados é"+ ((np + ni)/inteiros.size()));
    }
    public static void ex3(){
        ArrayList<String> palavras = new ArrayList<>();
        while (true){
            System.out.println("Digite uma palavra ou Sair para sair:");
            String p = in.nextLine();
            if(p.equalsIgnoreCase("sair")){
                break;
            }
            palavras.add(p);
        }
        System.out.println("Digite um numero");
        int a = in.nextInt();
        for (int i = 0 ; i < palavras.size(); i ++){
            if (palavras.get(i).length() < a){
                palavras.remove(i);
                i--;
            }
        }
        System.out.println(palavras);
    }
}

