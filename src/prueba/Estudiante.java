package prueba;

public class Estudiante extends Persona{

	double nota;
	
	public Estudiante(String nombre, int edad, double estatura, double nota) {
		super(nombre, edad, estatura);
		this.nota = nota;
	}

}
