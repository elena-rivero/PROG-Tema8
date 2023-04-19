package prueba;

public class Empleado extends Persona{
	protected double salario;
	double estatura;
	
	public Empleado(String nombre, int edad, double estatura, double salario) {
		super(nombre,edad,estatura);
		this.salario = salario;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public double getEstatura() {
		return estatura;
	}
	
	public double pagaExtra() {
		return 2400;
	}
	
	@Override
	void mostrarDatos() {
		super.mostrarDatos();
		System.out.println(salario);
	}
	
	String mostrarDatos(String apellido) {
		String res = "";
		res += nombre+"\n";
		res += apellido+"\n";
		res += edad+"\n";
		res += estatura+"\n";
		res += salario+"\n";
		return res;
	}
	
	
}
