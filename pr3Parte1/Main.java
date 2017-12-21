package pr3Parte1;

import pr3Parte1.Decrementador;
import pr3Parte1.Incrementador;
import pr3Parte1.MemoriaCompartida;

public class Main {

	public static void main(String[] args) {
		int M=10; //numero de decrementadores e incrementadores
		int N=5; //numero de llamadas a decrementar o incrementar
		
		MemoriaCompartida mem= new MemoriaCompartida(1);
		Incrementador[] in = new Incrementador[M];
		Decrementador[] de = new Decrementador[M];
		
		for(int i=0; i<M;i++) {
			in[i]= new Incrementador(N,mem,i);
			in[i].start();
			de[i]= new Decrementador(N,mem,i+M);
			de[i].start();
		}
		for(int i=0; i<M;i++) {
			try {
				in[i].join();
				de[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("En la memoria tenemos: "+mem);

	}

}
