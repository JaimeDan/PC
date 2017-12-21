package pr2Parte3;

public class MemoriaCompartida {
	
	public MemoriaCompartida(int procesos){
		this.in = new int[procesos];
		this.last = new int[procesos];
		
		for(int i =0; i< procesos;i++){
			this.in[i]=-1;
			this.last[i]=-1;
		}
	}
	
	public void decrementar(int id){
		num=num-1;
		
		System.out.println("Decrementado por " + id);
	}
	
	public void incrementar(int id){
		num=num+1;
		
		System.out.println("Incrementado por " + id);
	}
	
	public String toString(){
		return "Número: "+num +
				" In: "+this.show(in,in.length) +
				" Last: "+ this.show(last,last.length);
	}
	
	public void setIn(int pos, int valor){
		this.in[pos] = valor;
	}

	public void setLast(int pos, int valor){
		this.last[pos] = valor;
	}
	
	public int getIn(int pos){
		return this.in[pos];
	}

	public int getLast(int pos){
		 return this.last[pos];
	}
	
	private String show(int cadena[], int tam ){
		String aux="[";
		for (int i =0;i<tam-1;i++){
			aux=aux+cadena[i]+",";
		}
		aux=aux+cadena[tam-1]+"]";
		return aux;
	}
	
	private int in[];
	private int last[];
	private int num=0;
}
