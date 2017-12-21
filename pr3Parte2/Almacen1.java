package pr3Parte2;

public class Almacen1 implements Almacen {

	
	public void almacenar(Producto producto) {
		this.p=producto;
	}

	@Override
	public Producto extraer() {
		return this.p;
	}

	private Producto p;
}
