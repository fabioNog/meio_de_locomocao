package pck;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nome = "Ricardo";
		Scanner sc;
		Transitavel bike = new Bicicleta("preta", "caloi");
		System.out.println(bike.acelerar());
		System.out.println(((Bicicleta) bike).getCor());

		Veiculo carro = new Carro("123xc", "prata", "LTZ", "Chrevolet", "Sedan");
		System.out.println(carro.acelerar());
		System.out.println(((Carro) carro).getTipoCarro());

	}

}
