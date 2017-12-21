package pr3Parte2;

public interface Almacen {
	/**
	 * Almacena (como �ltimo) un producto en el almac�n. si no hay
	 * hueco el proceso que ejecute el m�todo bloquear� hasta que lo
	 * haya.
	 */
	public void almacenar(Producto producto);
	
	/**
	 * Extrae el primer producto disponible. Si no hay productos el
	 * proceso que ejecute el m�todo bloquear� hasta que se almacene un
	 * dato.
	 */
	public Producto extraer();
}
