import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Estante es = new Estante(5);

    public static void main(String[] args) {
        System.out.println("\tEscolha uma opção");
        System.out.println("1. Adicionar intem");
        System.out.println("2. Buscar item");
        System.out.println("3. Remover item");
        System.out.println("4. Exibir lista de itens da estante");
        System.out.println("0. Sair");
        int menu = in.nextInt();
        in.nextLine();

        switch (menu){
            case  1 :
                adicionarItem();
                break;
            case 2:
               
                    buscarItem();
                    break;
                            
                    
                

        }
        for (int s = 0; s < 5; s++) {
            System.out.println(es.getItens()[s].getTitulo());

        }
    }
    
    public static void adicionarItem() {
        Item i = null;
        
        System.out.println("Digite 1 para adicionar DVD ou 2 para adicionar Livro");
        int ad = in.nextInt();
        in.nextLine();

        if (ad == 1) {
            i = new Dvd();
            System.out.println("Informe o nome do DVD:");
            i.setTitulo(in.nextLine());
            in.nextLine();
            System.out.println("Informe o genero:");
            i.setGenero(in.nextLine());
            System.out.println("Informe o diretor:");
            Dvd dvd = new Dvd();
            dvd.setDiretor(in.nextLine());
            System.out.println("Informe o tempo de duração:0");
            dvd.setDuracao(in.nextDouble());
            in.nextLine();
            System.out.println("Informe o ano de lançamento");
            dvd.setAnoDeLancamento(in.nextInt());
            in.nextLine();

        } else {
            i = new Livro();
            System.out.println("Informe o nome do livro:");
            i.setTitulo(in.nextLine());
            System.out.println("Informe o genero:");
            i.setGenero(in.nextLine());
            System.out.println("Informe o autor:");
            Livro liv = new Livro();
            liv.setAutor(in.nextLine());
            System.out.println("Informe o quantidade de paginas:");
            liv.setQidePaginas(in.nextInt());
            System.out.println("Informe o ano de publicação:");
            liv.setAnoDePlublicacap(in.nextInt());
            System.out.println("Informe a edição:");
            liv.setEdicao(in.nextInt());
            in.nextLine();
        }
        es.adicionarItem(i);
    }
    public static void buscarItem() {

        System.out.println("Buscar item\nO que deseja buscar?");
        Item i = es.buscarItem(in.nextLine());
        if(i != null){
            System.out.println("O que deseja fazer com o item");
            System.out.println("1. Avaliar");
            System.out.println("2. Mostrar avaloações");
            System.out.println("0. Voltar para o menu inicial");
            int op = in.nextInt();
            
            switch (op){
                case 1 :
        i.avaliar();
        
        break;
                case 2:

                    for (Avaliacao r : i.getAvaliacao()) {
                        System.out.println(r);
                        
                    }
                case 3:
                    break;
        
    }
        }
    }
}
    

