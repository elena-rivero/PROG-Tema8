package ejercicio1;

public class HoraExacta extends Hora {

	int segundos;

	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);
		this.segundos = segundos;
	}

	public void setSegundo(int valor) {
		if (valor >= 1 && valor <= 59) {
			segundos = valor;
		}
	}

	@Override
	public void inc() {
		segundos++;
		if (segundos >= 60) {
			segundos = 0;
			super.inc();
		}
	}

	@Override
	public String toString() {
		String res = super.toString();// "hora:minutos"
		res += ":";
		if (segundos <= 9) {
			res += "0";
		}
		res += segundos;
		return res;
	}
}
