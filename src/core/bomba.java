package core;

public class bomba {
	private String nome;
	private double precoLitro;
	private double qtdeLitros;
	private double totalPagar;

	public bomba(String nome, double precoLitro, double qtdeLitros, double totalPagar) {
		super();
		this.nome = nome;
		this.precoLitro = precoLitro;
		this.qtdeLitros = qtdeLitros;
		this.totalPagar = totalPagar;
	}

	public void abastecerPorLitro(double litros) {
		this.qtdeLitros = litros;
		this.totalPagar = this.qtdeLitros * this.precoLitro;
	}

	public void abastecerPorValor(double valor) {
		this.totalPagar = valor;
		this.totalPagar = this.totalPagar / this.precoLitro;
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoLitro() {
		return precoLitro;
	}

	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}

	public double getQtdeLitros() {
		return qtdeLitros;
	}

	public void setQtdeLitros(double qtdeLitros) {
		this.qtdeLitros = qtdeLitros;
	}

	public double getTotalPagar() {
		return totalPagar;
	}

	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}

}
