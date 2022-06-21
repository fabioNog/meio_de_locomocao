package pck;

public class Carro extends Veiculo {
	
	// Sedan, SUV, Esportivo, Hatch
	private String tipoCarro;

	public Carro(String placa, String cor, String modelo, String marca, String tipoCarro) {
		super(placa, cor, modelo, marca);
		setTipoCarro(tipoCarro);
	}
	
	public String getTipoCarro() {
		return tipoCarro;
	}



	public void setTipoCarro(String tipoCarro) {
		this.tipoCarro = tipoCarro;
	}



	@Override
	public String acelerar() {
		return "Acelerar o carro!";
	}

	@Override
	public String frear() {
		return "Frear o Carro!";
	}

	@Override
	public String buzinar() {
		return "Buzinar o Carro!";
	}

}
