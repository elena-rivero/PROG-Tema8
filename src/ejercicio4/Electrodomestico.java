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
		comprobarColor(color);
		comprobarConsumeEnergetico(consumo);
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return String.valueOf(this.color);
	}

	public String getConsumo() {
		return String.valueOf(this.consumo);
	}

	public double getPeso() {
		return peso;
	}

	public void comprobarConsumeEnergetico(char letra) {
		switch (letra) {
		case 'A', 'B', 'C', 'D', 'E', 'F':
			this.consumo = ConsumoEnergetico.valueOf(String.valueOf(letra));
			break;
		default:
			this.consumo = ConsumoEnergetico.F;
		}
	}

	public void comprobarColor(String color) {
		switch (color) {
		case "blanco", "negro", "rojo", "azul", "gris":
			this.color = Color.valueOf(color);
			break;
		default:
			this.color = Color.blanco;
		}
	}

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
