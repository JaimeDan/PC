package pr4Parte1;

public class Decrementador extends Thread {

	public Decrementador(int veces, Monitor mem, int id){
		this.veces=veces;
		this.mem=mem;
		this.id=id;
	}
	public void run(){
		for(int i=0;i<veces;i++){//numero de veces que se hace
			this.mem.decrementar(id);
		}
	}
	
	private int id;
	private int veces;
	private Monitor mem;
}
