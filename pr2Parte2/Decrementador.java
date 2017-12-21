package pr2Parte2;

import pr2Parte2.MemoriaCompartida;

public class Decrementador extends Thread {

	public Decrementador(int veces, MemoriaCompartida mem, int id){
		this.veces=veces;
		this.mem=mem;
		this.id=id;
	}
	public void run(){
		
		for(int i=0;i<veces;i++){//numero de veces que se hace
			
			
			this.mem.setIn(id, true);
			this.mem.setLast(id);
			System.out.println(this.mem);
			
			while(this.mem.getIn(0) && this.mem.getLast()==1){
				System.out.println("Decrementador espera");
			}
				
			
			mem.decrementar();
			mem.setIn(id, false);
		}
	}
	
	private int id;
	private int veces;
	private MemoriaCompartida mem;
}
