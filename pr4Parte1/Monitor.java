package pr4Parte1;

public class Monitor {
	private int num = 0;//recurso compartido
	
	synchronized void incrementar(int id){
		num++;
		System.out.println("Incrementado por "+ id +" a "+ num);
	}
	synchronized void decrementar(int id){
		num--;
		System.out.println("Decrementado por "+ id +" a "+ num);
	}
	
}
