package Classes.Lanches;


public abstract class Sanduiche extends Lanche {


    private String[] adicionais = new String[10];

    public Sanduiche() {
        this.adicionarIngrediente("Pão");

    }

    public void adicionarAdicionais(String adicional){
        for (int i = 0; i < 10; i++) {
            if (this.adicionais[i] == null) {
                this.adicionais[i] = adicional;
                break;


            }
        }
    }






    public void  setadicionais (String[] adicionais){
        this.adicionais = adicionais;
    }
    public String[] getadicionais(){
        return this.adicionais;
    }
        }

