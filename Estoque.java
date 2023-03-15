import java.util.Scanner;

public class Estoque {
	String nome;
	int qtdAtual;
	private int qtdMinima;

	public Estoque() {
	}

	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}

	public void adicionarNome(String nome) {
		this.nome = nome;
	}

	public void adicionarQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public void adicionarQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public String getNome() {
		return nome;
	}

	public int getQtdMinima() {
		return qtdMinima;
	}

	public void darBaixa(int qtde) {
		int valorBaixa = qtde;
		if (valorBaixa < qtdAtual) {
			qtdAtual = qtdAtual + valorBaixa;
		} else {
			System.out.println("Estoque insuficiente para baixa");

		}
	}

	public String mostra() {
		return "Nome do item: "+  this.nome + "\nQuantidade atual do item: " + this.qtdAtual+ "\nQuantidade mínima: "+ this.qtdMinima;

	}

	public boolean precisaRepor() {
		if (qtdMinima <= qtdAtual) {
			return false;

		} else {
			return true;

		}

	}

	public static void main(String[] args) {
		Scanner scannear = new Scanner(System.in);
		System.out.println("Digite o nome do item que será registrado no estoque: ");
		String nomeItem = scannear.nextLine();
		System.out.println("Digite a quantidade mínima que este item deverá ter no estoque: ");
		int qtdMinimaEstoque = scannear.nextInt();
		System.out.println("Digite a quantidade atual do estoque: ");
		int qtdAtualEstoque = scannear.nextInt();
		Estoque estoque = new Estoque(nomeItem, qtdAtualEstoque, qtdMinimaEstoque);
		System.out.println("Escolha uma das opções abaixo");
		System.out.println("1 - Mostrar o estoque");
		System.out.println("2 - Adicionar ou remover item ao estoque");
		System.out.println("3 - Checa se precisa repor o item no estoque");
		System.out.println("4 - Altera o nome do item");
		System.out.println("5 - Altera a quantidade minima do item");
		System.out.println("6 - Altera a quantidade do item");
		System.out.println("7 - Mostra o nome do item");
		System.out.println("8 - Mostra a quantidade minima do item");
		System.out.println("9 - Mostra a quantidade do item");
		System.out.println("0 - Sair");
		int opcao = scannear.nextInt();
		switch (opcao) {
			case 1:
				System.out.println(estoque.mostra());
				break;
			case 2:
				System.out.println("Digite o valor que deve ser somado ou subtraído:");
				int alterarQtdItem = scannear.nextInt();
				estoque.darBaixa(alterarQtdItem);
				break;
			case 3:
				System.out.println(estoque.precisaRepor());

			case 4:
				System.out.println("Digite o novo nome: ");
				String novoNome = scannear.nextLine();
				estoque.adicionarNome(novoNome);
				break;
			case 5:
				System.out.println("Digite a nova quantidade mínima do item");
				int novaQtdMinima = scannear.nextInt();
				estoque.adicionarQtdMinima(novaQtdMinima);
				break;
			case 6:
				System.out.println("Digite a nova quantidade do item: ");
				int novaQtdItem = scannear.nextInt();
				estoque.adicionarQtdAtual(novaQtdItem);
			case 7:
				System.out.println(estoque.getNome());
				break;
			case 8:
				System.out.println(estoque.getQtdMinima());
				break;
			case 9:
				System.out.println(estoque.getQtdAtual());
				break;

			default:
				break;
		}


	}
}
