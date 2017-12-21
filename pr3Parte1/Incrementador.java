package pr3Parte1;



import pr3Parte1.MemoriaCompartida;

public class Incrementador extends Thread {

	public Incrementador(int veces, MemoriaCompartida mem, int id){
		this.veces=veces;
		this.mem=mem;
		this.id=id;
	}
	public void run(){//Rompe-Empate
		for(int i=0;i<veces;i++){//numero de veces que se hace
			
		
			this.mem.P();
			this.mem.incrementar(id);
			this.mem.V();
			
		}
	}
	
	private int id;
	private int veces;
	private MemoriaCompartida mem;
}
