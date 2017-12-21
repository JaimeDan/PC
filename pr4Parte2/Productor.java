package pr4Parte2;


public class Productor extends Thread{
	
	public Productor(int id, Monitor mon, int veces){
		this.id = id;
		this.mon = mon;
		this.veces = veces;
	}
	
	public void run(){
		for(int i=0; i< veces; i++){
			Producto p=new Producto();
			this.mon.producir(id, p);	
		}
	}
	
	private int veces;
	private int id;
	private Monitor mon;
}
