import java.util.ArrayList;
import java.util.Collections;

public class Baralho {

    private ArrayList<Carta> cartas = new ArrayList<>();

    public Baralho(){

        for (Naipe n : Naipe.values()) {
            int valorReal = 1;
            Naipe naipe = Naipe.values()[n.hashCode()];
            for (ValorCarta v : ValorCarta.values()) {
                ValorCarta valorCarta = ValorCarta.values()[v.hashCode()];
                valorReal ++;
                Carta c = new Carta(naipe, valorCarta, valorReal);
                cartas.add(c);
            }
        }
        shuffle();
    }

    public  void shuffle(){
        Collections.shuffle(this.cartas);

    }

    public Carta getFromTop(){
        return this.cartas.remove(0);

    }
    public Carta getFromBottom(){
          return this.cartas.remove(this.cartas.size()-1);
    }
    public Carta searchCard(Naipe naipe, ValorCarta valor){
        return (Carta) this.cartas.stream().filter(carta -> naipe.equals(carta.getNaipe()) && valor.equals(carta.getValor()));
    }
    public Carta searchCard(Naipe naipe, int valorReal){
        return null;
    }


    }
