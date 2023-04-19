package ejercicio2;

public class PrincipalEmpleado {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("Rafa");
		Directivo d1 = new Directivo("Mario");
		Operario op1 = new Operario("Alfonso");
		Oficial of1 = new Oficial("Luis");
		Tecnico t1 = new Tecnico("Pablo");
		System.out.println(e1);
		System.out.println(d1);
		System.out.println(op1);
		System.out.println(of1);
		System.out.println(t1);
	}

}
