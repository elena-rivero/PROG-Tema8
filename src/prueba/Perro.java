package prueba;

public class Perro extends AnimalConSonido{

	@Override
	public void voz() {
		System.out.println("Guau");
		System.out.println(version);
	}

}
