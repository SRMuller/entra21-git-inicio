public class Estante {

    private int capMaxima;

    public int capacidademaxima(){
        return 0;
    }
    private Item[] itens ;
    public Estante(int capMaxima){
        setCapMaxima(capMaxima);
        setItens(new Item[capMaxima]);

    }



    private  boolean estanteCheia(){
            if (qutDeItens() == capacidademaxima()){
        return false;
    }
        return false;
    }
    private int qutDeItens (){
        int qte = 0;
        for (Item a : itens)
            if (a != null){
                qte++;
            }
        return qte;
    }
    private Item buscarItem(String titulo){
        for (Item a : itens){
            if(a.getTitulo().equalsIgnoreCase(titulo)){
                return a;
            }
        }
        return null;
    }
    private boolean adicionarItem(Item item) {
        for (int i = 0; i < itens.length; i++) {
            if (itens[i] == null) {
                itens[i] = item;
                return true;
            }
        }
        return false;
    }

    private Item removerItem(int posicao){
     return itens[posicao]=null;

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
