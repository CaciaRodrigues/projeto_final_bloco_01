package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.util.Cores;
import ecommerce.model.Produto;
import ecommerce.model.VelaComum;
import ecommerce.model.VelaAromatica;
import ecommerce.controller.EstoqueController;
import ecommerce.model.AromatizadorDeAmbiente;

public class Menu {

	public static void main(String[] args) {
		
		EstoqueController produtos = new EstoqueController();
		
		Scanner leitor = new Scanner(System.in);
		
		int opcao, codigo, tipo;
		String nome, aroma, perfume;
		float preco;
		
		System.out.println("\nPreenchendo o Estoque\n");
		
		VelaComum vc1 = new VelaComum(produtos.gerarCodigo(), 50.00f, 1, "Vela Branca Comum");
		produtos.adicionar(vc1);
		
		VelaAromatica va1 = new VelaAromatica(produtos.gerarCodigo(), 100.00f, 2, "Floresta Turva", "Eucalipto, Tempestade, Terra Molhada");
		produtos.adicionar(va1);
		
		AromatizadorDeAmbiente ada1 = new AromatizadorDeAmbiente(produtos.gerarCodigo(), 150.00f, 3, "Bolo Quentinho", "Bauninha, Mel, Gengibre, Calor");
		produtos.adicionar(ada1);
		
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
			
			try {
				opcao = leitor.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leitor.nextLine();
				opcao = 0;
			}
			
			if (opcao == 9) {
				System.out.println();
				autora();
				leitor.close();
				System.exit(0);
			}
			
			switch (opcao) {
			
			case 1:
				System.out.println("Adicionar Produto: \n\n");
				
				System.out.println("Digite o Nome do Produto: ");
				leitor.skip("\\R?");
				nome = leitor.nextLine();
				System.out.println("Digite o Valor do Produto: ");
				preco = leitor.nextFloat();
				
				do {
					System.out.println("Digite o Tipo do Produto: ");
					tipo = leitor.nextInt();
				} while (tipo < 1 && tipo > 3);
				
				switch(tipo) {
				case 1 -> {
					produtos.adicionar(new VelaComum(produtos.gerarCodigo(), preco, tipo, nome));
				}
				case 2 -> {
					System.out.println("Digite o aroma da Vela Aromática: ");
					leitor.skip("\\R?");
					aroma = leitor.nextLine();
					produtos.adicionar(new VelaAromatica(produtos.gerarCodigo(), preco, tipo, nome, aroma));
				}
				case 3 -> {
					System.out.println("Digite o perfume do Aromatizador de Ambiente: ");
					leitor.skip("\\R?");
					perfume = leitor.nextLine();
					produtos.adicionar(new VelaAromatica(produtos.gerarCodigo(), preco, tipo, nome, perfume));
				}
					
				}
				
				keyPress();
				break;
			case 2:
				System.out.println("Listar todos os Produtos: \n\n");
				produtos.listarProdutos();
				keyPress();
				break;
			case 3:
				System.out.println("Buscar Produto por Código: \n\n");
				
				System.out.println("Digite o código do produto: ");
				codigo = leitor.nextInt();
				
				produtos.procurarNoEstoque(codigo);

				keyPress();
				break;
			case 4:
				System.out.println("Atualizar Dados do Produto: \n\n");
				
				System.out.println("Digite o Código do Produto: ");
				codigo = leitor.nextInt();
				
				var procuraProduto = produtos.procurarNoEstoque(codigo);
				
				if(procuraProduto != null) {
					
					tipo = procuraProduto.getTipo();
					
					System.out.println("Digite o Nome do Produto: ");
					leitor.skip("\\R?");
					nome = leitor.nextLine();
					System.out.println("Digite o Valor do Produto: ");
					preco = leitor.nextFloat();
					
					switch(tipo) {
					case 1 -> {
						produtos.atualizar(new VelaComum(codigo, preco, tipo, nome));
					}
					case 2 -> {
						System.out.println("Digite o aroma da Vela Aromática: ");
						leitor.skip("\\R?");
						aroma = leitor.nextLine();
						produtos.atualizar(new VelaAromatica(codigo, preco, tipo, nome, aroma));
					}
					case 3 -> {
						System.out.println("Digite o perfume do Aromatizador de Ambiente: ");
						leitor.skip("\\R?");
						perfume = leitor.nextLine();
						produtos.atualizar(new VelaAromatica(codigo, preco, tipo, nome, perfume));
					}
					default -> {
						System.out.println("Tipo de Produto Inválido!");
					}
						
					} 
					} else {
						System.out.println("O Produto não foi Encontrado!");
					
				}

				keyPress();
				break;
			case 5:
				System.out.println("Remover Produto: \n\n");
				
				System.out.println("Digite o código do Produto: ");
				codigo = leitor.nextInt();
				
				produtos.remover(codigo);

				keyPress();
				break;
			case 6:
				System.out.println("Adicionar ao Carrinho\n\n");
				
				System.out.println("Funcionalidade à ser Implementada! Aguarde ....");

				keyPress();
				break;
			case 7:
				System.out.println("Carrinho: \n\n");

				System.out.println("Funcionalidade à ser Implementada! Aguarde ....");
				
				keyPress();
				break;
			case 8:
				System.out.println("Sobre Nós: \n\n");
				
				System.out.println("Funcionalidade à ser Implementada! Aguarde ....");

				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n\n");
				
				keyPress();
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
	
	public static void keyPress() {
		
		try {
			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

}
