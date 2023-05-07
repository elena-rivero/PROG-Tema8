package ejercicio4;

public class Television extends Electrodomestico {

	private double resolucion = 20;
	private boolean sintonizador = false;

	public Television() {
		super();
	}

	public Television(double precio, double peso) {
		super(precio, peso);
	}

	public Television(double precioBase, String color, char consumo, double peso, double resolucion,
			boolean sintonizador) {
		super(precioBase, color, consumo, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}

	public double getResolucion() {
		return resolucion;
	}

	public boolean isSintonizador() {
		return sintonizador;
	}

	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		
		if (resolucion >= 40) {
			precioFinal += precioFinal*30/100;
		}
		
		if(sintonizador) {
			precioFinal += 50;
		}
		
		return precioFinal;
	}

}
