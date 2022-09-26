package Classes.Lanches;

public enum Emenu {
    XSALADA(1, "XSalada"),
    XBURGUER(2,"XBurger"),
    MISTO_QUENTE(3,"Misto Quente"),
    HOTDOG(4, "Hot Dog"),
    MINIPIZZA(5, "Mini Pizza"),
    PIZZA(6,"Pizza");


    private int valorOpcao;
    private String descricao;
    Emenu(int valor, String descricao) {
        valorOpcao = valor;
        this.descricao = descricao;
    }

    public static Emenu getByValorOpcao(int escolha) {
        for (Emenu e : Emenu.values()) {
            if (e.getValorOpcao() == escolha) {
                return e;
            }
        }
        return null;
    }

    public int getValorOpcao() {
        return this.valorOpcao;
    }

    public String getDescricao() {
        return this.descricao;
    }


}


