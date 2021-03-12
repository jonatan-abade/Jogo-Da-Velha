package jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Jogo game = new Jogo();

        int op;

        do {
            game.mostraGame();

            System.out.print("Escolha um numero de 1 a 9: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    game.escolha(0, 0);
                    break;
                case 2:
                    game.escolha(0, 1);
                    break;
                case 3:
                    game.escolha(0, 2);
                    break;
                case 4:
                    game.escolha(1, 0);
                    break;
                case 5:
                    game.escolha(1, 1);
                    break;
                case 6:
                    game.escolha(1, 2);
                    break;
                case 7:
                    game.escolha(2, 0);
                    break;
                case 8:
                    game.escolha(2, 1);
                    break;
                case 9:
                    game.escolha(2, 2);
                    break;
                default:
                    System.out.println("Valor inválido!!!");
                    break;
            }

            game.escolhaMaquina();

        } while (op != 0);

        sc.close();
    }

}
