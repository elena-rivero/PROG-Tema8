package ejercicio4;

public class Lavadora extends Electrodomestico {

	private double carga = 5;

	public Lavadora() {
		super();
	}

	public Lavadora(double precio, double peso) {
		super(precio, peso);
	}

	public Lavadora(double precioBase, String color, char consumo, double peso, double carga) {
		super(precioBase, color, consumo, peso);
		this.carga = carga;
	}

	public double getCarga() {
		return carga;
	}

	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		
		if (carga >= 30) {
			precioFinal += 50;
		}
		
		return precioFinal;
	}

}
