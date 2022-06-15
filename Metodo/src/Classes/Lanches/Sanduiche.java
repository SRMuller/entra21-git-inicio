package Classes.Lanches;


import java.util.ArrayList;

public abstract class Sanduiche extends Lanche {


    private ArrayList<String> adicionais = new ArrayList<>();

    public Sanduiche() {
        this.adicionarIngrediente("Pão");

    }

    public void adicionarAdicionais(String adicional){
        for (int i = 0; i < adicionais.size(); i++) {

                this.adicionais.add(adicional) ;
                break;


            }
        }
    public ArrayList<String> getadicionais(){
        return this.adicionais;
    }
        }

