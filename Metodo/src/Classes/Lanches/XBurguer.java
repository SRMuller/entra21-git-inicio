package Classes.Lanches;

public class XBurguer extends Sanduiche{

  private boolean aberto;
    public XBurguer(){
            this.adicionarIngrediente("Hamburguer");
            this.adicionarIngrediente("Queijo");
            this.adicionarIngrediente("Presunto");

        this.setTipo("X-Burguer");

    }

    public void  setAberto (boolean aberto){
        this.aberto = aberto;
    }
    public boolean isAberto(){
        return this.aberto;
}}


