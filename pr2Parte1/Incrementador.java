package pr2Parte1;

import pr2Parte1.MemoriaCompartida;

public class Incrementador extends Thread {

	public Incrementador(int veces, MemoriaCompartida mem){
		this.veces=veces;
		this.num=mem;
	}
	public void run(){
		for(int i=0;i<veces;i++){
			num.incrementar();
		}
	}
	
	private int veces;
	private MemoriaCompartida num;
}
