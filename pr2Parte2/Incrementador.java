package pr2Parte2;

import pr2Parte2.MemoriaCompartida;

public class Incrementador extends Thread {

	public Incrementador(int veces, MemoriaCompartida mem, int id){
		this.veces=veces;
		this.mem=mem;
		this.id=id;
	}
	public void run(){//Rompe-Empate
		for(int i=0;i<veces;i++){//numero de veces que se hace

			this.mem.setIn(id, true);
			this.mem.setLast(id);
			System.out.println(this.mem);
			
			while(this.mem.getIn(1) && this.mem.getLast()==0){
				System.out.println("Incrementador espera");
			}
				
			
			
			mem.incrementar();
			mem.setIn(id, false);
		}
	}
	
	private int id;
	private int veces;
	private MemoriaCompartida mem;
}
