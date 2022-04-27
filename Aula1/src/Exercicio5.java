import java.util.Scanner;

public class Exercicio5 {


    public static void main(String[] args) {

        double pr = 100;
        Scanner quant = new Scanner(System.in);
        int eleitores;
        System.out.print("Entre com a quantidade de eleitores: ");
        eleitores = quant.nextInt();
        Scanner br = new Scanner(System.in);
        int brancos;
        System.out.print("Informe a quantidade de votos em branco;");
        brancos = br.nextInt();
        Scanner nul = new Scanner(System.in);
        int nulos;
        System.out.print("Informe a quantidade de votos nulos: ");
        nulos = nul.nextInt();
        int vv = eleitores-brancos-nulos;
        double pv = pr/eleitores*vv;
        double vb = pr/eleitores*brancos;
        double pn = pr/eleitores*nulos;
        System.out.printf("Votos validos %d\nPercentual de votos válidos: %.2f%%\nPercentual de voto em branco: %.2f%%\nPercentual de votos nulos: %.2f%%47641",vv,pv,vb,pn);

    }
}
