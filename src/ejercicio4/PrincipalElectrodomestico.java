package ejercicio4;

import java.util.Scanner;

public class PrincipalElectrodomestico {

	public static void main(String[] args) {
		double precioElectrodomesticos = 0.0;
		double precioLavadoras = 0.0;
		double precioTelevisiones = 0.0;
		
		Electrodomestico[] electrodomesticos = { new Electrodomestico(), 
												 new Electrodomestico(1000, 20),
												 new Electrodomestico(300, "gris", 'A', 30),
												 new Lavadora(),
												 new Lavadora(800, 40),
												 new Lavadora(600, "blanco", 'E', 20, 5),
												 new Television(),
												 new Television(700, 5),
												 new Television(400, "negro", 'C', 10, 44, true),
												 new Electrodomestico(500,"azul", 'D', 15)};
		
		for(Electrodomestico e : electrodomesticos) {
			System.out.println("Precio final: " + e.precioFinal() + "; Precio base: " + e.getPrecioBase());
		}
		
		for(Electrodomestico e : electrodomesticos) {
			precioElectrodomesticos += e.precioFinal();
			
			if(e instanceof Lavadora) {
				precioLavadoras += e.precioFinal();
			} else if (e instanceof Television) {
				precioTelevisiones += e.precioFinal();
			}
		}
		
		System.out.println("Precio electrodomésticos: " + precioElectrodomesticos);
		System.out.println("Precio lavadoras: " + precioLavadoras);
		System.out.println("Precio televisiones: " + precioTelevisiones);
		
		String consumo = electrodomesticos[0].getConsumo();
		System.out.println(consumo);

	}

}
