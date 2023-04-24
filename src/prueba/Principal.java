package prueba;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
//		Persona p = new Empleado("Pepe", 40, 1.80, 2000);
//		Persona p1 = new Estudiante("María", 18, 1.60, 5);
//		
//		compruebaTipo(p);
//		compruebaTipo(p1);
//		
//		System.out.println(p);
//		System.out.println(p1);
//		
//		System.out.println(p.getClass().getSuperclass().getName());
//
//		System.out.println(Sonido.version);
//		System.out.println(Perro.version);
//		System.out.println(AnimalConSonido.version);
		
//		Perro perro = new Perro();
//		perro.vozDurmiendo();
		
		Persona per[] = new Persona[]{
			new Persona("Claudia", 8, 1.20),
			new Persona("Pepe", 10, 1.30),
			new Persona("Alicia", 10, 1.40),
			new Persona("Paco", 18, 1.70)
			};

		Arrays.sort(per);
		System.out.println(Arrays.toString(per));
		
	}

	private static void compruebaTipo(Persona p) {
		if (p instanceof Empleado) {
			((Empleado) p).salario = 2400;
		} else if (p instanceof Estudiante) {
			((Estudiante) p).nota = 10;
		}
	}

}
