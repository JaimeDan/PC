package pr4Parte2;


public class Consumidor extends Thread {

	public Consumidor(int id, Monitor mon, int veces){
		this.id = id;
		this.mon = mon;
		this.veces = veces;
	}
	
	
	public void run(){
		for(int i=0; i< veces; i++){
			this.mon.consumir(id);	
		}
	}
	
	private int veces;
	private int id;
	private Monitor mon;
}
