package pr3Parte1;

import java.util.concurrent.Semaphore;

public class MemoriaCompartida {
	
	public MemoriaCompartida(int mutexIni){
		this.mutex = new Semaphore(mutexIni);
	}
	
	public void decrementar(int id){
		num=num-1;
		
		System.out.println("Decrementado por " + id);
	}
	
	public void incrementar(int id){
		num=num+1;
		
		System.out.println("Incrementado por " + id);
	}
	
	public String toString(){
		return "Número: "+num;
	}
	
	public void P(){
		try {
			this.mutex.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void V(){
		this.mutex.release();
	}
	
	
	private int num=0;
	private Semaphore mutex;
}
