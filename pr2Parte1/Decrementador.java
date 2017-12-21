package pr2Parte1;

import pr2Parte1.MemoriaCompartida;

public class Decrementador extends Thread {

	public Decrementador(int veces, MemoriaCompartida mem){
		this.veces=veces;
		this.num=mem;
	}
	public void run(){
		for(int i=0; i<veces ;i++){
			num.decrementar();
		}
	}
	
	private int veces;
	private MemoriaCompartida num;
}
