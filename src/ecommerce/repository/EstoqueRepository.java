package ecommerce.repository;

import ecommerce.model.Produto;

public interface EstoqueRepository {
	
	// Métodos CRUD
	public void procurarPorCodigo(int codigo);
	public void listarProdutos();
	public void adicionar(Produto produto);
	public void atualizar(Produto produto);
	public void remover(int codigo);

}
