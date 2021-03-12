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
    void escolha(int l, int c) {
        if (!ocupado(l, c)) {
            posMatriz[l][c] = "X";
            escolhaMaquina();
        } else {
            System.out.println("Escolha um campo vazio!!!");
        }
    }

    //Metodo que faz com que o sistema escolha uma posição aletóriamente na sua vez
    void escolhaMaquina() {
        Random rand = new Random();
        int range = 2;
        int l = rand.nextInt(range + 1);
        int c = rand.nextInt(range + 1);

        if (!posMatriz[l][c].equals("X")) {
            posMatriz[l][c] = "Y";
        } else {
            l = rand.nextInt(range + 1);
            c = rand.nextInt(range + 1);
        }
    }

    boolean haveVencedor() {
        int op;
        boolean haveWinn = false;
        if (posMatriz[0][0].equals("X") && posMatriz[0][1].equals("X") && posMatriz[0][2].equals("X")) {
            mostraGame();
            System.out.println("Você venceu");
            haveWinn = true;
        }
        if (posMatriz[1][0].equals("X") && posMatriz[1][1].equals("X") && posMatriz[1][2].equals("X")) {
            mostraGame();
            System.out.println("Você venceu");
            haveWinn = true;
        }
        if (posMatriz[2][0].equals("X") && posMatriz[2][1].equals("X") && posMatriz[2][2].equals("X")) {
            mostraGame();
            System.out.println("Você venceu");
            haveWinn = true;
        }
        if (posMatriz[0][0].equals("X") && posMatriz[1][0].equals("X") && posMatriz[2][0].equals("X")) {
            mostraGame();
            System.out.println("Você venceu");
            haveWinn = true;
        }
        if (posMatriz[0][1].equals("X") && posMatriz[1][1].equals("X") && posMatriz[2][1].equals("X")) {
            mostraGame();
            System.out.println("Você venceu");
            haveWinn = true;
        }
        if (posMatriz[0][2].equals("X") && posMatriz[1][2].equals("X") && posMatriz[2][2].equals("X")) {
            mostraGame();
            System.out.println("Você venceu");
            haveWinn = true;
        }

        if (posMatriz[0][0].equals("X") && posMatriz[1][1].equals("X") && posMatriz[2][2].equals("X")) {
            mostraGame();
            System.out.println("Você venceu");
            haveWinn = true;
        }

        if (posMatriz[0][2].equals("X") && posMatriz[1][1].equals("X") && posMatriz[2][0].equals("X")) {
            mostraGame();
            System.out.println("Você venceu");
            haveWinn = true;
        }
        return haveWinn;

    }

}
