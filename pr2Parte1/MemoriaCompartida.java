package pr2Parte1;

public class MemoriaCompartida {
	
	public void incrementar(){
		i=i+1;;
	}
	
	public void decrementar(){
		i=i-1;;
	}
	
	public String toString(){
		return ""+i;
	}
	
	private int i=0;
}
