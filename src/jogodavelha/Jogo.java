package jogodavelha;

import java.util.Random;

public class Jogo {

    //A matriz posMatriz armaneza strings identicadoras para interação com o usuário
    String[][] posMatriz = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

    //Este metodo apresenta o estado atual da matriz(Jogo)
    void mostraGame() {
        for (String[] vetPo : posMatriz) {
            String escrita = "|";
            for (int c = 0; c < posMatriz.length; c++) {
                escrita += vetPo[c] + "|";
            }
            System.out.println(escrita);
        }
    }

    //Método que verifica se uma posição da matriz já foi preenchida pelo usuario
    boolean ocupado(int l, int c) {
        return (posMatriz[l][c].equals("X") || posMatriz[l][c].equals("Y"));
    }

    //Metodo que escolhe uma posição do jogo caso não ainda não esteja preenchido
    boolean escolha(int l, int c) {
        if (!ocupado(l, c)) {
            posMatriz[l][c] = "X";
            return true;
        } else {
            return false;
        }
    }

    //Metodo que faz com que o sistema escolha uma posição aletóriamente na sua vez
    boolean escolhaMaquina() {
        Random rand = new Random();

        int range = 2;

        int l = rand.nextInt(range + 1);
        int c = rand.nextInt(range + 1);

        if (!"X".equals(posMatriz[l][c])) {
            posMatriz[l][c] = "Y";
            return true;
        } else {
            return false;
        }
    }

}
