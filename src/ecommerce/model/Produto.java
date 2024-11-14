package ecommerce.model;

public abstract class Produto {
	
	private int codigo;
	private float preco;
	private int tipo;
	private String nome;
	
	public Produto(int codigo, float preco, int tipo, String nome) {
		this.codigo = codigo;
		this.preco = preco;
		this.tipo = tipo;
		this.nome = nome; 
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public void visualizar() {
		
		String tipo = "";
		
		switch (this.tipo) {
		case 1:
			tipo = "Vela Comum";
			break;
		case 2:
			tipo = "Vela Aromática";
			break;
		case 3:
			tipo = "Aromatizador de Ambiente";
			break;
		}
		
		System.out.println("\n\n~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~");
		System.out.println("\nDados do Produto: ");
		System.out.println("~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~");
		System.out.println("Código: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("Tipo: " + tipo);
		System.out.println("Preço: R$" + this.preco);
		
		
	}
}
