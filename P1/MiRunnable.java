package pr1;

public class MiRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Arranca: " + this.id);
		System.out.println("Termina: "+this.id);
		
	}
	
	//private long T;
	private int id;

}
