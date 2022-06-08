public class Livro extends Item{

    private String  autor;

    private int qidePaginas;

    private int anoDePlublicacap;

    private int edicao;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQidePaginas() {
        return qidePaginas;
    }

    public void setQidePaginas(int qidePaginas) {
        this.qidePaginas = qidePaginas;
    }

    public int getAnoDePlublicacap() {
        return anoDePlublicacap;
    }

    public void setAnoDePlublicacap(int anoDePlublicacap) {
        this.anoDePlublicacap = anoDePlublicacap;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
}
