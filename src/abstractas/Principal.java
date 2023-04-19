package abstractas;

public class Principal {

	public static void main(String[] args) {
		
		B b = new B();
		
		b.metodo2();

		C c = new C();
		c.metodo2();
		
		A a = new B();
		a.metodo2();
		
		a.metodo1();
		b.metodo1();
		c.metodo1();
	}

}
