package pr3Parte3;

public class AlmacenN implements Almacen {

	public AlmacenN(int N){
		this.p= new Producto[N];
		this.capacidad=N;
	}
	public void almacenar(Producto producto) {
		this.p[fin]=producto;
		fin = (fin+1)%capacidad;
	}
	

	@Override
	public Producto extraer() {
		ini=(ini+1)%capacidad;
		return this.p[ini];
	}

	private Producto[] p;
	int ini=0;
	int fin=0;
	int capacidad;
}
