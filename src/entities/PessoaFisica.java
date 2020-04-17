package entities;

public class PessoaFisica extends Contribuinte {

	private double gastosSaude;

	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		if (getRendaAnual() > 20000.00 && gastosSaude == 0.0) {
			return getRendaAnual() * 0.25;

		} else if (getRendaAnual() > 20000.00 && gastosSaude != 0.0) {
			return (getRendaAnual() * 0.25) - (gastosSaude * 0.5);

		} else if (gastosSaude == 0.0) {
			return getRendaAnual() * 0.15;
		} else {
			return (getRendaAnual() * 0.15) - (gastosSaude * 0.5);
		}
	}

}
