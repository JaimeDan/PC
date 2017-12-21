package pr1;

public class MiThread extends Thread {

	public MiThread(int id, long T){
		this.id=id;
		this.T=T;
	}
	public void run(){
		System.out.println("Arranca: " + this.id);
		try {
			sleep(T);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Thread "+this.id+ " interrumpido.");
			this.run(); 
			
		}
		System.out.println("Termina: "+this.id);
	}
	
	private int id;
	private long T;
}
