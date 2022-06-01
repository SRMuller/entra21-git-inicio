package Classes.Lanches;

public abstract class Lanche {

      private String[] ingredientes = new String[10];
        private double valor;
        private   String tipo;


        public void adicionarIngrediente(String ingrediente) {
            for (int i = 0; i < 10; i++) {
                if (this.ingredientes[i] == null) {
                    this.ingredientes[i] = ingrediente;
                    break;

                }
            }
        }

        public void montarComanda() {
            if(this instanceof MiniPizza){
                System.out.println("===" + this.tipo + " - \n" +"===="+ ((MiniPizza)this).getSabor() + "====");
            }else {
                System.out.println("====" + this.tipo + "====");
            }
            System.out.printf("Valor : R$%.2f\n", this.valor);
            System.out.println("-INGREDIENTES-");
            for (String ingredente : this.ingredientes) {
                if (ingredente != null) {
                    System.out.println(ingredente);
                }

            }
            System.out.println("---------------");
        }
    public void  setTipo (String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }public void  setValor (double valor){
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }
    public void  setIngredientes (String[] ingredientes){
        this.ingredientes = ingredientes;
    }
    public String[] getIngredientes(){
        return this.ingredientes;
}}

