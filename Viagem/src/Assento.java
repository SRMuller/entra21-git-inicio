public abstract class Assento {

    private boolean ocupado;

    private Double valor;

    public void ocupar() {
        this.setOcupado(true);

    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
