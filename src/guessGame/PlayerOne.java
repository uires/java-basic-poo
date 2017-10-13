package guessGame;

import java.util.concurrent.SynchronousQueue;
/* @author u�res */

public class PlayerOne {
	public String nome;
	int guess;
	public int dificuldade;
	public int sortNumber;

	public void setRandomNumber(int dif) {
		this.sortNumber = (int) (Math.random() * dif);
	}

	public int getSortNumber() {
		return this.sortNumber;
	}

	public void endGame() {
		System.out.println("\n***********Fim de jogo***********");

	}

	public void starGame() {
		System.out.println("\nIn�cio do Game");
	}

	public void playGame(int guess1, int guess2, int guess3, String nameOne, String nameTwo, String nameTree,
			int dificult) {
		this.starGame();
		if ((dificult > 20) || (dificult < 0)) {
			System.err.println("O valor foi abaixo ou acima, por padr�o a dificuldade vai ser 10");
			dificuldade = 10;
		} else {
			this.dificuldade = dificult;

		}

		this.setRandomNumber(dificuldade);
		System.out.println("Pensando em um n�mero de 0 a " + dificuldade);

		while (true) {

			System.out.println("O n�mero a ser adivinhado � " + sortNumber);
			boolean p1 = false;
			boolean p2 = false;
			boolean p3 = false;

			String statusOne = " n�o ";
			String statusTwo = " n�o";
			String statusTree = " n�o";

			if (guess1 == this.getSortNumber()) {
				p1 = true;
				statusOne = " sim";
			}
			if (guess2 == this.getSortNumber()) {
				p2 = true;
				statusTwo = " sim";
			}
			if (guess3 == this.getSortNumber()) {
				p3 = true;
				statusTree = " sim";
			}

			if ((guess1 == this.getSortNumber()) || (guess2 == this.getSortNumber())
					|| (guess3 == this.getSortNumber())) {
				System.out.println("\nQuem ser� que acertou? ");
				System.out.println("Jogador " + nameOne + " acertou? " + statusOne);
				System.out.println("Jogador " + nameTwo + " acertou? " + statusTwo);
				System.out.println("Jogador " + nameTree + " acertou? " + statusTree);
				this.endGame();
				break;

			} else {
				System.err.println("Tentem novamente ;D ");
				System.out.println("Jogador " + nameOne + " errou");
				System.out.println("Jogador " + nameTwo + " errou");
				System.out.println("Jogador " + nameTree + " errou");
				this.setRandomNumber(dificult);
			}
		}
	}
}
