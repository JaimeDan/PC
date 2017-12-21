package pr1;

public class Main{

	public static void main(String args[]){
		
		conThreads2();
		
	}
	
	private static void  conThreads(){
		int N=10;
		long T=1000;
		
		MiThread[] t = new MiThread[N];
		
		for(int i=0; i<N;i++) {
			t[i]= new MiThread(i,T);
			t[i].start();
		}
		t[5].interrupt();
		for(int i=0; i<N;i++) {
			try {
				t[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		System.out.println("Ha terminado todo");
	}
	
	private static void  conThreads2(){
		int N=100000;
		MemoriaCompartida mem= new MemoriaCompartida();
		MiThread2[] t = new MiThread2[N];
		
		for(int i=0; i<N;i++) {
			t[i]= new MiThread2(i,mem);
			t[i].start();
		}
		for(int i=0; i<N;i++) {
			try {
				t[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(mem);
	}
	
	
	private static void  conRunnable(){
		
		System.out.println("Ha terminado todo");
	}
	
}
