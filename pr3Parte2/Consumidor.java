package pr3Parte2;

import java.util.concurrent.Semaphore;

public class Consumidor extends Thread {

	public Consumidor(int id, Almacen alm, Semaphore lleno, Semaphore vacio, long tiempo, int veces){
		this.id = id;
		this.alm = alm;
		this.lleno = lleno;
		this.vacio = vacio;
		this.tiempo = tiempo;
		this.veces = veces;
	}
	
	public void consumir(Producto p){
		if(p != null){
			try {
				
				System.out.println("El consumidor "+this.id+" empieza a consumir.");
				Thread.sleep(tiempo);
				System.out.println("El consumidor "+this.id+" ha consumido el producto: "+ p +".");
				System.out.println("El consumidor "+this.id+" ha terminado de consumir.");

			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else{
			System.out.println("El producto no es válido");
		}
	}
	
	public void run(){
		for(int i=0; i< veces; i++){
			try {
				this.lleno.acquire();
				Producto p=alm.extraer();
				this.consumir(p);
				this.vacio.release();
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
