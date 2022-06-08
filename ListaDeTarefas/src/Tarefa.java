import java.util.Random;
import java.util.UUID;

public class Tarefa {

    private checkListItem[] checkList;


    private String uuid;

    private String nome;

    private String descricao;

    private boolean completa;

    public boolean temCheckList(){
        return this.getChecklist() != null;

        return false;
    }
    public void criarCheckList(int tamanho){
        this.setCheckList();

    }
    public boolean adicionarCheckListItem(checkLisst item) {
        return false;
    }



    public Tarefa() {
        this.setUuid(UUID.randomUUID().toString());
    }

    //Getter & Setter
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }



    public void setCheckLisstItem(checkLisst[] checkLisstItem) {
    }

}
