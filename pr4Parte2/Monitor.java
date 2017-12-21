package pr4Parte2;

public class Monitor {

	private final int N=10;
	private Producto[] buffer = new Producto[N];
	private int ini=0;
	private int fin=0;
	private int count=0;
	
	synchronized void producir(int id, Producto p){
		while(count==N){
			try {
				System.out.println("Productor "+id+" espera en "+count);
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		buffer[fin]=p;
		fin=(fin+1)%N;
		count++;
		notifyAll();
		System.out.println("Productor "+id+" ha producido "+ p);
	}
	
	synchronized Producto consumir(int id){
		while(count==0){
			try {
				System.out.println("Consumidor "+id+" espera en "+count);
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Producto p=buffer[ini];
		ini=(ini+1)%N;
		count--;
		notifyAll();
		System.out.println("Consumidor "+id+" ha consumido "+ p);
		return p;
	}
}
