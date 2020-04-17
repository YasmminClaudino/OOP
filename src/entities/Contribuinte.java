package entities;

public abstract class Contribuinte {

	private String nome;
	private double rendaAnual;

	public Contribuinte() {
	}

	public Contribuinte(String nome, double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}
	
	public abstract double imposto();
	
	public String toString() {
		return (nome + ": $ " + String.format("%.2f", imposto()));
	}

}
