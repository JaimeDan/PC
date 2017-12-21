package pr2Parte3;

import pr2Parte3.Decrementador;
import pr2Parte3.Incrementador;
import pr2Parte3.MemoriaCompartida;

public class Main {

	public static void main(String[] args) {
		int M=3; //numero de decrementadores e incrementadores
		int N=5; //numero de llamadas a decrementar o incrementar
		
		MemoriaCompartida mem= new MemoriaCompartida(2*M);
		Incrementador[] in = new Incrementador[M];
		Decrementador[] de = new Decrementador[M];
		
		for(int i=0; i<M;i++) {
			in[i]= new Incrementador(N,mem,2*M,i);
			in[i].start();
			de[i]= new Decrementador(N,mem,2*M,i+M);
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
