package pr3Parte1;



import pr3Parte1.MemoriaCompartida;

public class Decrementador extends Thread {

	public Decrementador(int veces, MemoriaCompartida mem, int id){
		this.veces=veces;
		this.mem=mem;
		this.id=id;
	}
	public void run(){
		for(int i=0;i<veces;i++){//numero de veces que se hace
			
			
			this.mem.P();
			this.mem.decrementar(id);
			this.mem.V();
			
		}
	}
	
	private int id;
	private int veces;
	private MemoriaCompartida mem;
}
