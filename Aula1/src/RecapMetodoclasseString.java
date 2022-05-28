import java.util.Scanner;

public class RecapMetodoclasseString {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        exe10();

    }

    public static void exe01() {
        String algo = in.nextLine();
        System.out.println("length" + algo.length());
        System.out.println("isEmpty" + algo.isEmpty());
        System.out.println("maiusculo" + algo.toLowerCase());
        System.out.println("minusculo" + algo.toLowerCase());
    }

    public static void exe02() {

        System.out.println("Digite alguma coisa");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite alguma outra coisa");
        String alguamOutraCoisa = in.nextLine();
        if (algumaCoisa.equals(alguamOutraCoisa)) {
            System.out.println("Iguais");
        } else if (algumaCoisa.equalsIgnoreCase(alguamOutraCoisa)) {
            System.out.println("Iguais independente de case");
        } else {
            System.out.println("São diferentes");
        }
    }

    public static void exe03() {
        System.out.println("Digite alguma coisa");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite alguma outra coisa");
        String alguamOutraCoisa = in.nextLine();
        if (algumaCoisa.contains(alguamOutraCoisa)) {
            System.out.println(alguamOutraCoisa + " faz parte de  " + algumaCoisa);
        } else if (alguamOutraCoisa.contains(algumaCoisa)) {
            System.out.println(alguamOutraCoisa + " faz parte de " + algumaCoisa);

        } else {
            System.out.println("nenhuma string pertence a outra");
        }
    }

    public static void exe04() {
        System.out.println("Digite alguma coisa");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite alguma outra coisa");
        String alguamOutraCoisa = in.nextLine();
        if (algumaCoisa.startsWith(alguamOutraCoisa)) {
            System.out.println(alguamOutraCoisa + "É prefixo de " + algumaCoisa);
        } else if (alguamOutraCoisa.startsWith(algumaCoisa)) {
            System.out.println(algumaCoisa + " É prefixo de " + alguamOutraCoisa);
        } else {
            System.out.println("As strings nãso são prefixos uma da outra");
        }

    }

    public static void exe05() {
        System.out.println("Digite alguma coisa");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite alguma outra coisa");
        String alguamOutraCoisa = in.nextLine();
        if (algumaCoisa.endsWith(alguamOutraCoisa)) {
            System.out.println(alguamOutraCoisa + "É sufixo de " + algumaCoisa);
        } else if (alguamOutraCoisa.endsWith(algumaCoisa)) {
            System.out.println(algumaCoisa + " É sufixo de " + alguamOutraCoisa);
        } else {
            System.out.println("As strings não são sufixos uma da outra");

        }
    }

    public static void exe06() {
        System.out.println("Digite alguma coisa");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite alguma outra coisa");
        String alguamOutraCoisa = in.nextLine();
        int pos = algumaCoisa.indexOf(alguamOutraCoisa);
        System.out.println(" posição é: " + pos);
    }

    public static void exe07() {
        String cyphered = "lala#lwve#-rwgra22lalang!#<3";
        String decyphered = cyphered.replace("w", "o");
        decyphered = decyphered.replace("2", "m");
        decyphered = decyphered.replace("#", " ");
        decyphered = decyphered.replace("lala", "i");
        decyphered = decyphered.replace("-", "p");
        System.out.println(decyphered);
    }

    public static void exe08() {
        System.out.println("Informe a quantidade de numeros que deseja informar:");
        int quant = in.nextInt();
        int[] numeros = new int[quant];
        for (int i = 0; i < quant; i++) {
            System.out.println("Iforme um numero:");
            numeros[i] = in.nextInt();
        }
        int soamPar = 0, somaImpar = 0;
        for (int valor : numeros) {
            if (valor % 2 == 0) {
                soamPar += valor;
            } else {
                somaImpar += valor;
            }
        }
        System.out.println("valoro dos pares: " + soamPar + "\nvalor dos impares: " + somaImpar);
    }

    public static void exe09() {
        System.out.println("Informe a quantidade de palvras que deseja informar:");
        int quant = in.nextInt();
        String[] palavras = new String[quant];
        in.nextLine();
        for (int i = 0; i < quant; i++) {
            System.out.println("Iforme uma palavra:");
            palavras[i] = in.nextLine();
        }
        System.out.println("Informe o numero de corte:");
        int numero = in.nextInt();
        for (int i = 0; i < quant; i++) {
            if (palavras[i].length() < numero) {
                palavras[i] = null;
            }
        }
        for (String palavra : palavras) {
            if (palavra != null) {
                System.out.println(palavra);
            }
        }
    }

    public static void exe10() {
        System.out.println("Informe a quantidade de numeros que deseja informar na lista 1:");
        int lista1 = in.nextInt();
        int[] numeros = new int[lista1];
        for (int i = 0; i < lista1; i++) {
            System.out.println("Iforme um numero:");
            numeros[i] = in.nextInt();
        }
        System.out.println("Informe a quantidade de numeros que deseja informar na lista 1:");
        int lista2 = in.nextInt();
        int[] numeros2 = new int[lista2];
        for (int i = 0; i < lista2; i++) {
            System.out.println("Iforme um numero:");
            numeros2[i] = in.nextInt();
        }

        for (int resto : numeros) {
            boolean achou = false;
            for (int resto2 : numeros2) {
                if (resto == resto2) {
                    achou = true;
                    break;

                }

                }
            if (!achou){
                System.out.print(resto);
            }
        }
    }
}




