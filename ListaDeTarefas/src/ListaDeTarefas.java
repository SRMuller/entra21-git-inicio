public class ListaDeTarefas {



    private  Tarefa[] tarefa;
    private int tmanhoDaLista;
    private String nomeDaLista;

    public boolean adicionarTarefa(Tarefa tarefa){
        return false;
    }
    public Tarefa buscarTarefa(int posicao){

        return  null;
    }

    public  boolean alterarOrdemTarefa(Tarefa tarefa, int novaPosicao){
        return false;
    }

    public void ListaTarefas(int tamanhoLista) {

    }
//Getter & Setter

    public Tarefa[] getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa[] tarefa) {
        this.tarefa = tarefa;
    }

    public int getTmanhoDaLista() {
        return tmanhoDaLista;
    }

    public void setTmanhoDaLista(int tmanhoDaLista) {
        this.tmanhoDaLista = tmanhoDaLista;
    }

    public String getNomeDaLista() {
        return nomeDaLista;
    }

    public void setNomeDaLista(String nomeDaLista) {
        this.nomeDaLista = nomeDaLista;
    }

}
