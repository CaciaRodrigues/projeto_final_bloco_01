package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Produto;
import ecommerce.repository.EstoqueRepository;

public class EstoqueController implements EstoqueRepository {
	
	private ArrayList<Produto> estoqueProdutos = new ArrayList<Produto>();
	int codigo = 0;

	@Override
	public void procurarPorCodigo(int codigo) {
		var produto = procurarNoEstoque(codigo);
		
		if (produto != null)
			produto.visualizar();
		else
			System.out.println("O produto de código: " + codigo + " não se encontra em estoque!");
		
	}

	@Override
	public void listarProdutos() {
		for (var produto : estoqueProdutos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void adicionar(Produto produto) {
		estoqueProdutos.add(produto);
		System.out.println("\nProduto " + produto.getCodigo() +  " adicionado ao estoque!");
		
	}

	@Override
	public void atualizar(Produto produto) {
		var procuraProduto = procurarNoEstoque(produto.getCodigo());
		
		if (procuraProduto != null) {
			estoqueProdutos.set(estoqueProdutos.indexOf(procuraProduto), produto);
			System.out.println("\nOs dados do produto de código: " + codigo + " foram atualizados com sucesso!");
		} else
			System.out.println("\nO produto de código: " + codigo + " não foi encontrado!");
		
	}

	@Override
	public void remover(int codigo) {
		var produto = procurarNoEstoque(codigo);
		
		if (produto != null) {
			if (estoqueProdutos.remove(produto) == true) {
				System.out.println("\nO Produto de código: " + codigo + " foi removido com sucesso!");
			}
		} else {
			System.out.println("\nO produto de código: " + codigo + " não existe no Estoque!");
		}
		
	}
	
	public int gerarCodigo() {
		return ++ codigo;
	}
	
	public Produto procurarNoEstoque(int codigo) {
		for (var produto : estoqueProdutos) {
			if (produto.getCodigo() == codigo) {
				return produto;
			}
		}
		return null;
	}

}
