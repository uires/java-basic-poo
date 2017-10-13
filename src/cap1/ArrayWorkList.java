package cap1;

public class ArrayWorkList {
	public static void main(String[] args) {
		String[] workListOne = { "24/7", "várias camadas", "30.000 pés", "B-to-B", "todos ganham" + "", "front-end",
				"baseado na web", "difundido", "inteligente", "seis sigma", "caminho crítico", "dinâmico" };
		String[] workListTwo = { "paráfase", "help", "fulleasy", "ansiedade", "grunn", "zito", "conio", "moneyLonder",
				"bandit", "drunk", "estudante" };
		String[] workListTree = { "tudo", "nada", "eles", "eu", "resiliência", "strong brain", "delph form",
				"fortemente acoplado", "mar and mbr and psw and ci and ap", "what?" };

		int quantasPalavrasOne = workListOne.length;
		int quantasPalavrasTwo = workListTwo.length;
		int quantasPalavrasTree = workListTree.length;

		System.out.println(quantasPalavrasOne);
		System.out.println(quantasPalavrasTwo);
		System.out.println(quantasPalavrasTree);

		int rand1 = (int) (Math.random() * quantasPalavrasOne);
		int rand2 = (int) (Math.random() * quantasPalavrasTwo);
		int rand3 = (int) (Math.random() * quantasPalavrasTree);

		System.out.println("Nós precisamos de: " + workListOne[rand1]);
		System.out.println("Nós também precisamos de: " + workListTwo[rand2]);
		System.out.println("E por fim de: " + workListTree[rand3]);
	}

}
