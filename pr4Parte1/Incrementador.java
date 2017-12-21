package pr4Parte1;


public class Incrementador extends Thread {

	public Incrementador(int veces, Monitor mem, int id){
		this.veces=veces;
		this.mem=mem;
		this.id=id;
	}
	public void run(){//Rompe-Empate
		for(int i=0;i<veces;i++){//numero de veces que se hace
			this.mem.incrementar(id);
		}
	}
	
	private int id;
	private int veces;
	private Monitor mem;
}
