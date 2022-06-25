package Classes.Lanches;


import java.util.ArrayList;
import java.util.HashMap;

public abstract class Sanduiche extends Lanche {


    private HashMap<String, Double> adicionais = new HashMap<>();

    public Sanduiche() {
        this.adicionarIngrediente("Pão");

    }

    public void adicionarAdicionais(String adicional, double valor){
        for (int i = 0; i < adicionais.size(); i++) {

                this.adicionais.put(adicional,valor) ;
                break;


            }
        }
    public HashMap<String, Double> getadicionais(){
        return this.adicionais;
    }
    @Override
    public double getValor(){
        double valorTotal = super.getValor();
        for (Double valor: this.adicionais.values()){
            valorTotal += valor;
        }
        return valorTotal;


        }
    }
    


