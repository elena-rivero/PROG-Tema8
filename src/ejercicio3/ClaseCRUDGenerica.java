package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class ClaseCRUDGenerica<T> {
	List<T> elementos = new ArrayList<>();

	
	public void añadirElemento(T elemento) {
		int pos = elementos.indexOf(elemento);

		if (pos >= 0) {
			elementos.add(elemento);
		} else {
			System.out.println("No hay espacio libre");
		}
	}

	public void listarProductos() {
		for (T e : elementos) {
			if (e != null) {
				System.out.println(e);
			}
		}
	}

	public void eliminarElemento(T elemento) {
		elementos.remove(elemento);
	}
	
}
