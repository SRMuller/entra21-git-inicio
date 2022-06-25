import java.util.ArrayList;

public class Onibus implements MeioTrasporte{




    private ArrayList<AssentoOnibus> assentos = new ArrayList<>();

    public ArrayList<AssentoOnibus> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoOnibus> assentos) {
        this.assentos = assentos;
    }

    @Override
    public boolean verificaocupacao(String assento) {
        for (AssentoOnibus a : assentos) {
            if (a.getLugar().equalsIgnoreCase(assento)) {
                return a.isOcupado();
            }

        }
        return false;
    }

    public Onibus(ArrayList<AssentoOnibus> assentos) {
        this.assentos = assentos;
    }

    @Override
    public int quantidadeLivre() {
        int contAssento = 0;
        for (AssentoOnibus a : assentos) {
            if (a.isOcupado()) {
                contAssento++;
            }
            return assentos.size() - contAssento;
        }
        return contAssento;
    }

    @Override
    public void mostrarAssento() {
        int j = 1;
        int k = 2;
        int l = 3;
        for (int i = 0; i < assentos.size(); i += 4) {

            if (i< 9 || j < 9){
                System.out.println("[0" + assentos.get(i).getLugar() + "][0" + assentos.get(j).getLugar() + "]|" +
                        "|[0" + assentos.get(k).getLugar() + "][0" + assentos.get(l).getLugar() + "]");
        }else {
                System.out.println("[" + assentos.get(i).getLugar() + "][" + assentos.get(j).getLugar() + "]|" +
                        "|[" + assentos.get(k).getLugar() + "][" + assentos.get(l).getLugar() + "]");
            }
            j += 4;
            k += 4;
            l += 4;
        }

    }

    @Override
    public Assento getAssento(String assento) {
        for (AssentoOnibus a : assentos){
            if (a.getLugar().equalsIgnoreCase(assento)){
                return a;
            }
        }
        return null;
    }
   public Onibus (int linhasCadeiras){
        for (int i = 1; i <=  4*linhasCadeiras; i++){
            AssentoOnibus a = new AssentoOnibus();
            a.setLugar(String.valueOf(i));
            assentos.add(a);
        }
    }
}
