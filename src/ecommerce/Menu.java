package ecommerce;

import java.util.Scanner;

import ecommerce.util.Cores;
import ecommerce.model.Produto;
import ecommerce.model.VelaComum;
import ecommerce.model.VelaAromatica;
import ecommerce.model.AromatizadorDeAmbiente;

public class Menu {

	public static void main(String[] args) {
		
		// Teste da Classe VelaComum
		VelaComum velaBranca = new VelaComum(1, 50.0f, 1, "Vela Branca Comum");
		velaBranca.visualizar();
		
		// Teste da Classe VelaAromatica
		VelaAromatica velaMorango = new VelaAromatica(2, 100.0f, 2, "Campo de Morango", "Morangos Silvestres");
		velaMorango.visualizar();
		
		// Teste da Classe AromatizadorDeAmbiente
		AromatizadorDeAmbiente aromaEucalipito = new AromatizadorDeAmbiente(3, 150.0f, 3, "Floresta de Eucalipto", "Eucalipto");
		aromaEucalipito.visualizar();
		
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
