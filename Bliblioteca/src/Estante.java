public class Estante {

    private int capMaxima;

    public int capacidademaxima(){
        return 0;
    }
    private Item[] itens = new Item[5];
    public Estante(int capMaxima){
        setCapMaxima(capMaxima);
        setItens(new Item[capMaxima]);

    }



    private  boolean estanteCheia(){
            return  this.qutDeItens() == this.capacidademaxima();
    }
    public int qutDeItens (){
        int qte = 0;
        for (Item a : itens) {
            if (a != null) {
                qte++;
            }
        }
        return qte;
    }
    public Item buscarItem(String titulo){
        for (Item a : itens){
            if (a != null){
            if(a.getTitulo().equalsIgnoreCase(titulo)){
                return a;
            }
            }
        }
        return null;
    }
    public boolean adicionarItem(Item item) {
        for (int i = 0; i < itens.length; i++) {
            if (itens[i] == null) {
                itens[i] = item;
                return true;
            }
        }
        return false;
    }

    public Item removerItem(int posicao){
        Item i = itens[posicao];
        itens[posicao]=null;
        return i;

    }

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }

}
