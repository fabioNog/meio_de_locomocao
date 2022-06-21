package pck;

public abstract class Veiculo implements Transitavel {

	private String placa;
	private String cor;
	private String modelo;
	private String marca;

	public Veiculo(String placa, String cor, String modelo, String marca) {
		super();
		setPlaca(placa);
		setCor(cor);
		setModelo(modelo);
		setMarca(marca);
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
