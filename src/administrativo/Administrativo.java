package administrativo;

import prueba.Empleado;

public class Administrativo extends Empleado{
	
	public Administrativo(String nombre, int edad, double estatura, double salario) {
		super(nombre, edad, estatura, salario);
	}
	
	public double getSalario() {
		return salario;
	}
}
