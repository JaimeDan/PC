package pr4Parte2;


public class Main {

	public static void main(String[] args) {
		
		int Prod = 10; //número de productores
		int Cons = 10; //número de consumidores
		int vecesP = 10; //número de veces que produce cada productor
		int vecesC = 10; //número de veces que consume cada consumidor
		
		Monitor mon = new Monitor();
		Productor[] prod = new Productor[Prod];
		Consumidor[] cons = new Consumidor[Cons];
		
		
		for(int i=0; i<Prod;i++) {
			prod[i]= new Productor(i, mon, vecesP);
			prod[i].start();
		}
		
		for(int i=0; i<Cons;i++) {
			cons[i]= new Consumidor(i, mon, vecesC);
			cons[i].start();
		}
		
		
		for(int i=0; i<Prod;i++) {
			try {
				prod[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int i=0; i<Cons;i++) {
			try {
				cons[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
