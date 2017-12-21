package pr2Parte2;

public class MemoriaCompartida {
	
	public MemoriaCompartida(){
		this.in = new boolean [2];
		this.last = 0;
	}
	
	public void decrementar(){
		i=i+1;
	}
	
	public void incrementar(){
		i=i-1;
	}
	
	public String toString(){
		return "Número: "+i +
				" In: ["+this.in[0]+"," +this.in[1]+"]"+
				" Last: "+ this.last;
	}
	
	public void setIn(int pos, boolean value){
		this.in[pos] = value;
	}

	public void setLast(int pos){
		this.last=pos;
	}
	
	public boolean getIn(int pos){
		return this.in[pos];
	}

	public int getLast(){
		 return this.last;
	}
	
	
	
	private boolean in[];
	private int last;
	private int i=0;
}
