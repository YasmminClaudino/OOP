package entities;

public class PessoaJuridica extends Contribuinte {

	private Integer nFuncionario;

	public PessoaJuridica(String nome, double rendaAnual, Integer nFuncionario) {
		super(nome, rendaAnual);
		this.nFuncionario = nFuncionario;
	}

	public Integer getnFuncionario() {
		return nFuncionario;
	}

	public void setnFuncionario(Integer nFuncionario) {
		this.nFuncionario = nFuncionario;
	}

	@Override
	public double imposto() {
		if (nFuncionario > 10) {
			return getRendaAnual() * 0.14;
		} else {
			return getRendaAnual() * 0.16;
		}

	}

}
