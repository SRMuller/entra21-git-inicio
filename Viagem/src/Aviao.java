import java.util.ArrayList;

public class  Aviao implements MeioTrasporte {
    public ArrayList<AssentoVoo> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoVoo> assentos) {
        this.assentos = assentos;
    }]

    public void Aviao ( int linhasCadeirasLuxo, int linhasCadeirasEconomica ){
    for (int i = 0; i < 4*linhasCadeirasLuxo; i++){
        AssentoVoo a = new AssentoVoo();
        a.setClasse(ClasseAssentoVoo.LUXO);
        assentos.add(a);
    }
        for (int i = 0; i < 6*linhasCadeirasEconomica; i++){
            AssentoVoo a = new AssentoVoo();
            a.setClasse(ClasseAssentoVoo.ECONOMICA);
            assentos.add(a);

        }
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

    public Object getAssento(String assento, ClasseAssentoVoo classe) {
        for (AssentoVoo v : assentos) {
            if (v.getCodigo().equalsIgnoreCase(assento) && v.getClasse().equals(classe)){
                return v;
            }
        }

        return null;
    }
}
