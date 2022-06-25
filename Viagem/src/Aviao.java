import java.util.ArrayList;

public class  Aviao implements MeioTrasporte {
    public ArrayList<AssentoVoo> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoVoo> assentos) {
        this.assentos = assentos;
    }

    private ArrayList<AssentoVoo> assentos = new ArrayList<>();

    @Override
    public boolean verificaocupacao(String assento) {
        for (AssentoVoo v : assentos) {
            if ( getAssentos().equals(v)){
                return v.isOcupado();
            }

        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int assentoslivres = 0;
        for (AssentoVoo v : assentos) {
        if (!v.isOcupado()){
            assentoslivres ++;
        }

    }
        return assentoslivres;
    }

    @Override
    public void mostrarAssento() {

    }

    @Override
    public Object getAssento(String assento) {
        for (AssentoVoo v : assentos) {
            if (v.getCodigo().equalsIgnoreCase(assento)){
                return v;
            }
        }
        return null;
    }

    public Object getAssento(String assento, String classe) {
        for (AssentoVoo v : assentos) {
            if (v.getCodigo().equalsIgnoreCase(assento)){
                return v;
            }
        }

        return null;
    }
}
