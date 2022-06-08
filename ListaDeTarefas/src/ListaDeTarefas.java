public class ListaDeTarefas {



    private  Tarefa[] tarefa;
    private int tmanhoDaLista;
    private String nomeDaLista;

    public boolean adicionarTarefa(Tarefa tarefa){
        if (tarefa.getOrdem() < 0 || tarefa.getOrdem() >= this.getTmanhoDaLista()){
            return false;
        }
        for (int i = 0; i < this.getTmanhoDaLista(); i++){
            if (this.tarefa[i] == null){
                this.tarefa[i] = tarefa;
                return true;
            }else if (this.tarefa[i].getOrdem() == tarefa.getOrdem()){
                break;
            }
        }
        return false;
    }
    public Tarefa buscarTarefa(int ordem){
        for (Tarefa t : this.getTarefa()){
            if (t != null && t.getOrdem() == ordem){
                return t;
            }
        }

        return  null;
    }

    public  boolean alterarOrdemTarefa(int antigaOrdem, int novaOrdem){
        Tarefa tarefaAntiga = buscarTarefa(antigaOrdem);
        Tarefa novaTarefa = buscarTarefa(novaOrdem);
        if (tarefaAntiga == null || novaTarefa == null ){
            return false;
        }
        
         tarefaAntiga.setOrdem(novaOrdem);
         novaTarefa.setOrdem(antigaOrdem);
         return false;
    }

    public void ListaTarefas(int tamanhoLista) {
        this.setTmanhoDaLista(tamanhoLista);
        this.setTarefa(new Tarefa[tamanhoLista]);

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
