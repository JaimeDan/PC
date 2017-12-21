package pr3Parte2;

import java.util.concurrent.Semaphore;

public class Productor extends Thread{
	
	public Productor(int id, Almacen alm, Semaphore lleno, Semaphore vacio, long tiempo, int veces){
		this.id = id;
		this.alm = alm;
		this.lleno = lleno;
		this.vacio = vacio;
		this.tiempo = tiempo;
		this.veces = veces;
	}

	public Producto producir(){
		
		try {
			
			System.out.println("El productor "+this.id+" empieza a producir.");
			Thread.sleep(tiempo);
			Producto p = new Producto();
			p.generar();
			System.out.println("El productor "+this.id+" ha producido el producto: "+ p +".");
			System.out.println("El productor "+this.id+" Ha terminado de producir.");
		
			return p;
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}
	
	public void run(){
		for(int i=0; i< veces; i++){
			try {
				this.vacio.acquire();
				this.alm.almacenar(this.producir());
				this.lleno.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private int veces;
	private int id;
	private Almacen alm;
	private Semaphore lleno;
	private Semaphore vacio;
	private long tiempo = 0;
}
