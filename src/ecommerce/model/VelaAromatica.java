package ecommerce.model;

public class VelaAromatica  extends Produto{

	private String aroma;
	
	public VelaAromatica(int codigo, float preco, int tipo, String nome, String aroma) {
		super(codigo, preco, tipo, nome);
		this.aroma = aroma;
	}

	public String getAroma() {
		return aroma;
	}

	public void setAroma(String aroma) {
		this.aroma = aroma;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aroma: " + this.aroma);
	}
	

}
