import java.util.Scanner;

public abstract class  Item {



    private Avaliacao[] avaliacao = new Avaliacao[30];


    public void avaliar() {
        Scanner in = new Scanner(System.in);
        Avaliacao av = new Avaliacao();
        System.out.println("Irforme seu nome:");
        av.setNome(in.nextLine());
        System.out.println("Digete uma nota de 1 a 5:");
        av.setRating(in.nextDouble());
        in.nextLine();
        System.out.println("Iforme um feedback: (opcional)");
        av.setFeedback(in.nextLine());
        for (int i = 0; i < 30; i++) {
            if (this.avaliacao[i] == null) {
                this.avaliacao[i] = av;
                break;
            }
        }
    }
    public double getTotalRating(){
        double average= 0 ;
        double qte = 0;
        for (Avaliacao a : avaliacao){
            if (a != null){
                qte ++;
                average += a.getRating() ;
            }
        }

         return average/qte;
    }
        private String titulo;

        private String  genero;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    private double valor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

