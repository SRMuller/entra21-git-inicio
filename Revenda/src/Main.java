import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static HashMap<String, ArrayList<Carro>> carros = new HashMap<>();
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("0 - PARA SAIR");
        System.out.println("1 - PARA VER LISTA DE CARROS");
        System.out.println("2 - PARA ADICIONAR UM CARROS");
        System.out.println("3 - VENDER UM CARRO");
        int opcao = in.nextInt();
        boolean sair = true;
        while (sair){
            switch (opcao){
                case 0 :
                    sair = false; break;
                case 1 :
                    if(carros.isEmpty()){
                        System.out.println("NÃO HÁ CARROS NA LISTA");
                    }  else {
                        System.out.println(carros);
                    }
                case 2 :
                    System.out.println("Informe a marca");
                    String marca = in.nextLine();
                    System.out.println("Informe o modelo");
                    Carro c = new Carro();
                    c.setmodelo(in.nextLine());
                    System.out.println("infome o valor");
                    double valor = in.nextDouble();
                    carros.put(marca, new ArrayList<>());
                    carros.get(marca).add(c);
                case 3 :
                    if(carros.isEmpty()){
                        System.out.println("NÃO HÁ CARROS NA LISTA");

            } else  {
                        System.out.println("Informe a marca");
                        String marca1 = in.nextLine();



                    }
            }



    }
}}
