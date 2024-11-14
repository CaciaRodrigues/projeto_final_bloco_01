package ecommerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int opcao;
		
		
		while (true) {
		
			System.out.println("*****************************************************");
			System.out.println("+                                                   +");
			System.out.println("|                  Alma Olfativa                    |");
			System.out.println("+                                                   +");
			System.out.println("|       Despertando memórias através do olfato      |");
			System.out.println("+                                                   +");
			System.out.println("*****************************************************");
			System.out.println("|                                                   |");
			System.out.println("+           1 - Adicionar produto                   +");
			System.out.println("|           2 - Listar todos os Produtos            |");
			System.out.println("+           3 - Buscar Produto por Código           +");
			System.out.println("|           4 - Atualizar Dados do Produto          |");
			System.out.println("+           5 - Remover Produto                     +");
			System.out.println("|           6 - Adicionar ao Carrinho               |");
			System.out.println("+           7 - Carrinho                            +");
			System.out.println("|           8 - Sobre nós                           |");
			System.out.println("+           9 - Sair                                +");
			System.out.println("|                                                   |");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			opcao = leitor.nextInt();
			
			if (opcao == 9) {
				System.out.println();
				autora();
				leitor.close();
				System.exit(0);
			}
			
			switch (opcao) {
			
			case 1:
				System.out.println("Adicionar Produto: \n\n");

				break;
			case 2:
				System.out.println("Listar todos os Produtos: \n\n");

				break;
			case 3:
				System.out.println("Buscar Produto por Código: \n\n");

				break;
			case 4:
				System.out.println("Atualizar Dados do Produto: \n\n");

				break;
			case 5:
				System.out.println("Remover Produto: \n\n");

				break;
			case 6:
				System.out.println("Adicionar ao Carrinho\n\n");

				break;
			case 7:
				System.out.println("Carrinho: \n\n");

				break;
			case 8:
				System.out.println("Sobre Nós: \n\n");

				break;
			default:
				System.out.println("\nOpção Inválida!\n\n");

				break;
			}
		}

	}
	
	public static void autora() {
		System.out.println("\n~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~");
		System.out.println("\nProjeto Desenvolvido por: Cacia S R Sousa");
		System.out.println("\nEmail: caciarodriguues@gmail.com");
		System.out.println("\nLinkedIn: www.linkedin.com/in/caciarodrigues");
		System.out.println("\nGithub: github.com/CaciaRodrigues");
		System.out.println("\n~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~");
	}

}
