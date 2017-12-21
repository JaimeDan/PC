package pr1;

public class MiThread2 extends Thread{
	public MiThread2(int id, MemoriaCompartida a){
		this.id=id;
		num=a;
	}
	public void run(){
		
		//System.out.println("Incrementando en "+this.id +" el entero " +this.num);
		/*try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		num.incrementar();
		
	}
	
	private int id;
	private MemoriaCompartida num;
}
