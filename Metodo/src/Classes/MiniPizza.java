package Classes;

public class MiniPizza extends Lanche {
    public boolean borda;
    public String saborBorda;

    public String sabor;
    public MiniPizza() {
        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Queijo ");
        this.adicionarIngrediente("Calabresa");
        this.adicionarIngrediente("Molho de tomate");
        this.adicionarIngrediente("Alho");
        this.tipo = "Mini Pizza";


    }

    @Override
    public void montarComanda(){
        super.montarComanda();
        if (this.borda) {
            System.out.println("-- " +sabor+" --\n--BORDA RECHEADA --\n--"+ saborBorda +"--");

        }
    }
}