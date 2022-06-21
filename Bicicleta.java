package pck;

public class Bicicleta implements Transitavel{

	private String cor;
	private String marca;
	
	public Bicicleta(String cor, String marca) {
		super();
		setCor(cor);
		setMarca(marca);
	}
	
	

	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	@Override
	public String acelerar() {		
		return "Acelelar Bicicleta!";
	}

	@Override
	public String frear() {		
		return "Frear Bicicleta!";
	}

	@Override
	public String buzinar() {		
		return "Buzinar Bicicleta!";
	}

}
