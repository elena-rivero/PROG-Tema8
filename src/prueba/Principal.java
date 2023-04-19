package prueba;

public class Principal {

	public static void main(String[] args) {
		Persona p = new Empleado("Pepe", 40, 1.80, 2000);
		Persona p1 = new Estudiante("María", 18, 1.60, 5);
		
		compruebaTipo(p);
		compruebaTipo(p1);
		
		System.out.println(p);
		System.out.println(p1);
		
		System.out.println(p.getClass().getSuperclass().getName());

	}

	private static void compruebaTipo(Persona p) {
		if(p instanceof Empleado) {
			((Empleado) p).salario = 2400;
		} else if (p instanceof Estudiante) {
			((Estudiante) p).nota = 10;
		}
	}

}
