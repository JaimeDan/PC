package pr2Parte1;

import pr2Parte1.MemoriaCompartida;

public class Main {

	public static void main(String[] args) {
		int M=1000; //numero de decrementadores e incrementadores
		int N=100; //numero de llamadas a decrementar o incrementar
		MemoriaCompartida mem= new MemoriaCompartida();
		Incrementador[] in = new Incrementador[N];
		Decrementador[] de = new Decrementador[N];
		
		for(int i=0; i<N;i++) {
			in[i]= new Incrementador(M,mem);
			in[i].start();
			de[i]= new Decrementador(M,mem);
			de[i].start();
		}
		for(int i=0; i<N;i++) {
			try {
				in[i].join();
				de[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(mem);

	}

}
