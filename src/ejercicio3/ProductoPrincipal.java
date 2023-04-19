package ejercicio3;

public class ProductoPrincipal {

	public static void main(String[] args) {
		NoPerecedero np = new NoPerecedero("Galletas", 1, "Desayuno");
		
		double total = np.calcular(30);
		System.out.println(total);
	}

}
