package ejercicio4;

public class Electrodomestico {

	enum Color {
		blanco, negro, rojo, azul, gris
	}

	enum ConsumoEnergetico {
		A, B, C, D, E, F
	}

	protected double precioBase = 100.0;
	protected Color color = Color.blanco;
	protected ConsumoEnergetico consumo = ConsumoEnergetico.F;
	protected double peso = 5.0;

	public Electrodomestico() {

	}

	public Electrodomestico(double precioBase, double peso) {
		super();
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}

	public Electrodomestico(double precioBase, String color, char consumo, double peso) {
		super();
		if (precioBase > 0) {
			this.precioBase = precioBase;
		}
		if (peso > 0) {
			this.peso = peso;
		}
		// TODO: Conversión entre String y los enumerados
		// this.color = color;
		// this.consumo = consumo;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		// TODO: Devolver el color como cadena
		return "";
	}

	public String getConsumo() {
		// TODO: Devolver el consumo como cadena
		return "";
	}

	public double getPeso() {
		return peso;
	}

	// TODO: comprobarConsumoEnergetico

	// TODO: comprobarColor

	public double precioFinal() {
		double precioFinal = precioBase;
		switch (consumo) {
		case A:
			precioFinal += 100;
			break;
		case B:
			precioFinal += 80;
			break;
		case C:
			precioFinal += 60;
			break;
		case D:
			precioFinal += 50;
			break;
		case E:
			precioFinal += 30;
			break;
		case F:
			precioFinal += 10;
			break;
		}

		if (peso >= 0 && peso <= 19) {
			precioFinal += 10;
		} else if (peso >= 20 && peso <= 49) {
			precioFinal += 50;
		} else if (peso >= 50 && peso <= 79) {
			precioFinal += 80;
		} else if (peso >= 80) {
			precioFinal += 100;
		}

		return precioFinal;
	}
}
