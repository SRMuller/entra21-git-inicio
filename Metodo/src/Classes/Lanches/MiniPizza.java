package Classes.Lanches;

public class MiniPizza extends Lanche {
    private boolean borda;
    private String saborBorda;
    private String sabor;

    public MiniPizza() {
        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Queijo Mussarela");
        this.adicionarIngrediente("Molho de tomate");

        this.setTipo("Mini Pizza");
    }

    public boolean isBorda() {
        return borda;
    }

    public void setBorda(boolean borda) {
        this.borda = borda;
    }

    private void adicionarSaborEingredientes(String sabor) {
        this.setSabor(sabor);
        switch (sabor.toUpperCase()) {
            case "4 QUEIJOS":
                this.adicionarIngrediente("Cheddar");
                this.adicionarIngrediente("Catupiry");
                this.adicionarIngrediente("Provolone");
                break;
            case "CALABRESA":
                this.adicionarIngrediente("Calabresa");
                break;
            case "FRANGO C/ CATUPIRY":
                this.adicionarIngrediente("Frango");
                this.adicionarIngrediente("catupiry");
                break;
            case "MARGUERITA":
                this.adicionarIngrediente("Tomate");
                this.adicionarIngrediente("Manjericão");
                break;
            case "PORTUGUESA":
                this.adicionarIngrediente("Pesunto");
                this.adicionarIngrediente("Cebola");
                this.adicionarIngrediente("Ovo");
                break;

        }

    }






    public void setborda(boolean borda) {
        this.borda = borda;
    }

    public boolean isborda() {
        return this.borda;
    }
    public void  setSaborBorda (String saborBorda){
        this.saborBorda = saborBorda;
    }
    public String getSaborBorda(){
        return this.saborBorda;

    }
    public void  setSabor (String sabor){
        this.sabor = sabor;
    }
    public String getSabor(){
        return this.sabor;

    }
}