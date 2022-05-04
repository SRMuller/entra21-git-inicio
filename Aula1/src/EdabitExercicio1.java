public class EdabitExercicio1 {

    public static void main(String[] args) {

        String[] palavras = {"abc", "def", "gh1"};
        char letraProibida = 'a';
        boolean achou = false;
        for (String palavra : palavras){
            for (int i  = 0; i < palavra.length(); i++) {
                  achou = palavra.charAt(i) == letraProibida;
                  if (achou) {
                      break;
                  }
            }
            if (achou) {
                break;
            }
        }

        if (achou){
            System.out.println("Encontrou letra proibida");

        }
        else {
            System.out.println("não encontrou letra proibida");
        }
    }

}
