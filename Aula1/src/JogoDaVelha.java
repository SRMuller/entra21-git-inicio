import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[][] tabuleiro = {
                {" - ", " - ", " - "},
                {" - ", " - ", " - "},
                {" - ", " - ", " - "},
        };
        for (int i = 0; i < 8; i++) {
            System.out.println("Informe uma posição");
            int a = in.nextInt();
            if (a > 0 && a < 10) {

                switch (a) {
                    case 1:
                        if (tabuleiro[0][0].equals(" - ")) {
                            tabuleiro[0][0] = " O ";
                            for (int l = 0; l < 3; l++) {
                                for (int j = 0; j < 3; j++) {
                                    System.out.print(tabuleiro[l][j]);
                                }
                                System.out.println("");
                            }
                        } else {
                            System.out.println("Posição ocupada");
                        }

                        break;
                    case 2:
                        if (tabuleiro[0][1].equals(" - ")) {
                            tabuleiro[0][1] = " O ";
                            for (int l = 0; l < 3; l++) {
                                for (int j = 0; j < 3; j++) {
                                    System.out.print(tabuleiro[l][j]);

                                }
                                System.out.println("");
                            }

                        } else {
                            System.out.println("Posição ocupada");
                        }
                        break;

                    case 3:
                        if (tabuleiro[0][2].equals(" - ")) {
                            tabuleiro[0][2] = " O ";
                            for (int l = 0; l < 3; l++) {
                                for (int j = 0; j < 3; j++) {
                                    System.out.print(tabuleiro[l][j]);

                                }
                                System.out.println("");
                            }

                        } else {
                            System.out.println("Posição ocupada");
                        }
                        break;
                    case 4:
                        if (tabuleiro[1][0].equals(" - ")) {
                            tabuleiro[1][0] = " O ";
                            for (int l = 0; l < 3; l++) {
                                for (int j = 0; j < 3; j++) {
                                    System.out.print(tabuleiro[l][j]);

                                }
                                System.out.println("");
                            }


                        } else {
                            System.out.println("Posição ocupada");
                        }
                        break;
                    case 5:
                        if (tabuleiro[1][1].equals(" - ")) {
                            tabuleiro[1][1] = " O ";
                            for (int l = 0; l < 3; l++) {
                                for (int j = 0; j < 3; j++) {
                                    System.out.print(tabuleiro[l][j]);

                                }
                                System.out.println("");
                            }

                        } else {
                            System.out.println("Posição ocupada");
                        }
                        break;
                    case 6:
                        if (tabuleiro[1][2].equals(" - ")) {
                            tabuleiro[1][2] = " O ";
                            for (int l = 0; l < 3; l++) {
                                for (int j = 0; j < 3; j++) {
                                    System.out.print(tabuleiro[l][j]);

                                }
                                System.out.println("");
                            }
                        } else {
                            System.out.println("Posição inválida");
                        }
                        break;
                    case 7:
                        if (tabuleiro[2][0].equals(" - ")) {
                            tabuleiro[2][0] = " O ";
                            for (int l = 0; l < 3; l++) {
                                for (int j = 0; j < 3; j++) {
                                    System.out.print(tabuleiro[l][j]);

                                }
                                System.out.println("");
                            }
                        } else {
                            System.out.println("Posição ocupada");
                        }
                        break;
                    case 8:
                        if (tabuleiro[2][1].equals(" - ")) {
                            tabuleiro[2][1] = " O ";
                            for (int l = 0; l < 3; l++) {
                                for (int j = 0; j < 3; j++) {
                                    System.out.print(tabuleiro[l][j]);

                                }
                                System.out.println("");
                            }
                        } else {
                            System.out.println("Posição ocupada");
                        }
                        break;
                    case 9:
                        if (tabuleiro[2][2].equals(" - ")) {
                            tabuleiro[2][2] = " O ";
                            for (int l = 0; l < 3; l++) {
                                for (int j = 0; j < 3; j++) {
                                    System.out.print(tabuleiro[l][j]);

                                }
                                System.out.println("");

                            }
                        } else {
                            System.out.println("Posição ocupada");
                        }


                }
                int s = 0;
                for (int x = 0; x < 8; x++)
                    if (tabuleiro[s][s].equals(tabuleiro[s][x]) && tabuleiro[x][x].equals(tabuleiro)) {
                        System.out.println("Vencedor é " + tabuleiro[s][s]);

                    } else {
                        System.out.println("Informe a posição para X:");
                        int b = in.nextInt();
                        switch (b) {
                            case 1:
                                if (tabuleiro[0][0].equals(" - ")) {
                                    tabuleiro[0][0] = " X ";
                                    for (int l = 0; l < 3; l++) {
                                        for (int j = 0; j < 3; j++) {
                                            System.out.print(tabuleiro[l][j]);
                                        }
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.println("Posição ocupada ");
                                }
                                break;
                            case 2:
                                if (tabuleiro[0][1].equals(" - ")) {
                                    tabuleiro[0][1] = " X ";
                                    for (int l = 0; l < 3; l++) {
                                        for (int j = 0; j < 3; j++) {
                                            System.out.print(tabuleiro[l][j]);

                                        }
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.println("Posição ocupada");
                                }
                                break;
                            case 3:
                                if (tabuleiro[0][2].equals(" - ")) {
                                    tabuleiro[0][2] = " X ";
                                    for (int l = 0; l < 3; l++) {
                                        for (int j = 0; j < 3; j++) {
                                            System.out.print(tabuleiro[l][j]);

                                        }
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.println("Posição ocupada");
                                }
                                break;
                            case 4:
                                if (tabuleiro[1][0].equals(" - ")) {
                                    tabuleiro[1][0] = " X ";
                                    for (int l = 0; l < 3; l++) {
                                        for (int j = 0; j < 3; j++) {
                                            System.out.print(tabuleiro[l][j]);

                                        }
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.println("Posição ocupada");
                                }
                                break;
                            case 5:
                                if (tabuleiro[1][1].equals(" - ")) {
                                    tabuleiro[1][1] = " X ";
                                    for (int l = 0; l < 3; l++) {
                                        for (int j = 0; j < 3; j++) {
                                            System.out.print(tabuleiro[l][j]);

                                        }
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.println("Posição ocupada");
                                }
                                break;
                            case 6:
                                if (tabuleiro[1][2].equals(" - ")) {
                                    tabuleiro[1][2] = " X ";
                                    for (int l = 0; l < 3; l++) {
                                        for (int j = 0; j < 3; j++) {
                                            System.out.print(tabuleiro[l][j]);

                                        }
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.println("Posição ocupada");
                                }
                                break;
                            case 7:
                                if (tabuleiro[2][0].equals(" - ")) {
                                    tabuleiro[2][0] = " X ";
                                    for (int l = 0; l < 3; l++) {
                                        for (int j = 0; j < 3; j++) {
                                            System.out.print(tabuleiro[l][j]);

                                        }
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.println("Posição ocupada");
                                }
                                break;
                            case 8:
                                if (tabuleiro[2][1].equals(" - ")) {
                                    tabuleiro[2][1] = " X ";
                                    for (int l = 0; l < 3; l++) {
                                        for (int j = 0; j < 3; j++) {
                                            System.out.print(tabuleiro[l][j]);

                                        }
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.println("Posição ocupada");
                                }
                                break;
                            case 9:
                                if (tabuleiro[2][2].equals(" - ")) {
                                    tabuleiro[2][2] = " X ";
                                    for (int l = 0; l < 3; l++) {
                                        for (int j = 0; j < 3; j++) {
                                            System.out.print(tabuleiro[l][j]);

                                        }
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.println("Posição ocupada");
                                }
                                break;


                        }
                    }

                    } else{
                    System.out.println("Posição invalida");
                }
            }
        }
    }
