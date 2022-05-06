import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Recaptulação {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isHealer = true;
        while (isHealer) {
            System.out.println("Informe a abreviação do Champ");
            String clazz = in.next();
            clazz = clazz.toUpperCase();
            if (clazz.length() != 3) {
                System.out.println("Não é uma classe valida");
            } else {
                switch (clazz) {
                    case "PDL", "WAR", "DKN", "GNG":
                        System.out.println("A classe é Tank");
                        break;

                    case "WHM", "SCH", "AST", "DAG":
                        System.out.println("A classe é Healer");
                        break;

                    case "MNR", "DRG", "NJA", "SMR", "RPR", "BRD", "MCH", "DNC", "BLM", "SMN", "RDM", "BEM":
                        System.out.println("A classe é DPS");

                    default:
                        System.out.println("Não pertence a uma classe definida");}
                        isHealer = false;
                        break;



            }


        }

    }
}