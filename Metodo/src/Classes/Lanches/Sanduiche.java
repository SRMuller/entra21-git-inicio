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





            @Override
            public void montarComanda () {
                super.montarComanda();
                if (adicionais[0] != null) {
                    System.out.println("--ADICIONAIS --");
                    for (int i = 0; i < adicionais.length; i++) {
                        if (adicionais[i] != null) {
                            System.out.print("--" + adicionais[i].toUpperCase() + "--\n");
                        }
                    }

                }
            }
    public void  setAdicionais (String[] adicionais){
        this.adicionais = adicionais;
    }
    public String[] getAdicionais(){
        return this.adicionais;
    }
        }

