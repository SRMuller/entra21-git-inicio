import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    private ArrayList<AssentoOnibus> assentos = new ArrayList<>();

    for (int i = 1; i <= 4 * linhasCadeiras; i++){
        AssentoOnibus a = new AssentoOnibus();
        a.setLugar(String.valueOf(i));
        assentos.add(a);

}