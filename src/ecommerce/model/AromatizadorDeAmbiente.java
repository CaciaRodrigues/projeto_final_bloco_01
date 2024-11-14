package ecommerce.model;

public class AromatizadorDeAmbiente  extends Produto{
	
	private String perfume;

	public AromatizadorDeAmbiente(int codigo, float preco, int tipo, String nome, String perfume) {
		super(codigo, preco, tipo, nome);
		this.setPerfume(perfume);
	}

	public String getPerfume() {
		return perfume;
	}

	public void setPerfume(String perfume) {
		this.perfume = perfume;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Perfume: " + this.perfume);
	}

}
