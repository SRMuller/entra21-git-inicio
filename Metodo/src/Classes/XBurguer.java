package Classes;

public class XBurguer extends Sanduiche{

    public boolean aberto;
    public XBurguer(){
            this.adicionarIngrediente("Hamburguer");
            this.adicionarIngrediente("Queijo");
            this.adicionarIngrediente("Presunto");

        this.tipo = "X-Burguer";

    }
    @Override
    public void montarComanda(){
        super.montarComanda();
        if (this.aberto){
            System.out.println("--LANCHE ABERTO-");
        }

    }
}


