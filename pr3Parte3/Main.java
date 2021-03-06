package pr3Parte3;

import java.util.concurrent.Semaphore;

public class Main {

	public static void main(String[] args) {
		int N=10;
		Semaphore lleno = new Semaphore(0);
		Semaphore vacio = new Semaphore(N);
		Semaphore mutexP = new Semaphore(1);
		Semaphore mutexC = new Semaphore(1);
		int Prod = 10; //n�mero de productores
		int Cons = 10; //n�mero de consumidores
		int vecesP = 10; //n�mero de veces que produce cada productor
		int vecesC = 10; //n�mero de veces que consume cada consumidor
		long tiempoP = 1; //Tiempo que tarda un productor en producir cada producto
		long tiempoC = 2; //Tiempo que tarda un consumidor en consumir cada producto
		
		Almacen almacen = new AlmacenN(N);
		Productor[] prod = new Productor[Prod];
		Consumidor[] cons = new Consumidor[Cons];
		
		
		for(int i=0; i<Prod;i++) {
			prod[i]= new Productor(i, almacen, lleno, vacio, tiempoP, vecesP,mutexP);
			prod[i].start();
		}
		for(int i=0; i<Cons;i++) {
			cons[i]= new Consumidor(i, almacen, lleno, vacio, tiempoC, vecesC, mutexC);
			cons[i].start();
		}
		
		for(int i=0; i<Cons;i++) {
			try {
				cons[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int i=0; i<Prod;i++) {
			try {
				prod[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
