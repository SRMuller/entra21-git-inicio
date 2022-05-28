package Passagens;

public  class Voo {

    public String[][] codificacaoassento;

    public boolean[][] ocupacaoassento;

    public Voo(int linhas, int cadeirasPorLinha) {
linhas=25;
cadeirasPorLinha = 8;

        this.ocupacaoassento = new boolean[linhas][cadeirasPorLinha];
        this.codificacaoassento = new String[linhas][cadeirasPorLinha];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < cadeirasPorLinha; j++) {
                if (i == 0) {
                    this.codificacaoassento[i][j] = "A" + j;
                } else if (i == 1) {
                    this.codificacaoassento[i][j] = "B" + j;
                } else if (i == 2) {
                    this.codificacaoassento[i][j] = "C" + j;
                } else if (i == 3) {
                    this.codificacaoassento[i][j] = "D" + j;
                } else if (i == 4) {
                    this.codificacaoassento[i][j] = "E" + j;
                } else if (i == 5) {
                    this.codificacaoassento[i][j] = "F" + j;
                } else if (i == 6) {
                    this.codificacaoassento[i][j] = "G" + j;
                } else if (i == 7) {
                    this.codificacaoassento[i][j] = "H" + j;
                } else if (i == 8) {
                    this.codificacaoassento[i][j] = "I" + j;
                } else if (i == 9) {
                    this.codificacaoassento[i][j] = "J" + j;
                } else if (i == 10) {
                    codificacaoassento[i][j] = "K" + j;
                } else if (i == 11) {
                    codificacaoassento[i][j] = "L" + j;
                } else if (i == 12) {
                    codificacaoassento[i][j] = "M" + j;
                } else if (i == 13) {
                    codificacaoassento[i][j] = "N" + j;
                } else if (i == 14) {
                    codificacaoassento[i][j] = "O" + j;
                } else if (i == 15) {
                    codificacaoassento[i][j] = "P" + j;
                } else if (i == 16) {
                    codificacaoassento[i][j] = "Q" + j;
                } else if (i == 17) {
                    codificacaoassento[i][j] = "R" + j;
                } else if (i == 18) {
                    codificacaoassento[i][j] = "S" + j;
                } else if (i == 19) {
                    codificacaoassento[i][j] = "T" + j;
                } else if (i == 20) {
                    codificacaoassento[i][j] = "U" + j;
                } else if (i == 21) {
                    codificacaoassento[i][j] = "V" + j;
                } else if (i == 22) {
                    codificacaoassento[i][j] = "W" + j;
                } else if (i == 23) {
                    codificacaoassento[i][j] = "X" + j;
                } else if (i == 24) {
                    codificacaoassento[i][j] = "Y" + j;
                } else if (i == 25) {
                    codificacaoassento[i][j] = "Z" + j;
                }
                for (int k = 0; i < 25; i++) {
                    for (int l = 0; j < 7; j++) {


                        System.out.print(codificacaoassento[k][l] + "   ");
                    }
                    System.out.println("");
                }
            }
        }
    }
public boolean verificaocupacao(){


}
}




