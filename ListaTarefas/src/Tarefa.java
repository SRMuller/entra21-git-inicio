import java.util.UUID;

public class Tarefa {


    private String uuid;
    private String nome;
    private String descricao;
    private boolean completa;
    private int ondem;

    public Tarefa () {
        this.setUuid(UUID.randomUUID().toString());

    }






    public void completar() {


    }


//Getter & Setter

    public String getUuid () {
            return uuid;
        }

        public void setUuid (String uuid){
            this.uuid = uuid;
        }

        public String getNome () {
            return nome;
        }

        public void setNome (String nome){
            this.nome = nome;
        }

        public String getDescricao () {
            return descricao;
        }

        public void setDescricao (String descricao){
            this.descricao = descricao;
        }

        public boolean isCompleta () {
            return completa;
        }

        public void setCompleta ( boolean completa){
            this.completa = completa;
        }

        public int getOndem () {
            return ondem;
        }

        public void setOndem ( int ondem){
            this.ondem = ondem;
        }
    }

