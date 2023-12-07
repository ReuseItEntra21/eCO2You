package br.senac.eco2you.modelo.entidade.itemRetirada;


public class ItemRetirada {

	private String material;
	private double peso;

	public ItemRetirada(String material, double peso) {
		this.material = material;
		this.peso = peso;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}