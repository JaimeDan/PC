package pr2Parte2;

import pr2Parte2.Decrementador;
import pr2Parte2.Incrementador;
import pr2Parte2.MemoriaCompartida;

public class Main {

	public static void main(String[] args) {
		int N=100; //numero de llamadas a decrementar o incrementar
		
		MemoriaCompartida mem= new MemoriaCompartida();
		Incrementador in = new Incrementador(N,mem,0);
		Decrementador de = new Decrementador(N,mem,1);
		
		in.start();
		de.start();
		try {
			in.join();
			de.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("En la memoria tenemos: "+mem);

	}

}
