package pr2Parte3;



import pr2Parte3.MemoriaCompartida;

public class Incrementador extends Thread {

	public Incrementador(int veces, MemoriaCompartida mem, int procesos, int id){
		this.veces=veces;
		this.mem=mem;
		this.procesos=procesos;
		this.id=id;
	}
	public void run(){//Rompe-Empate
		for(int i=0;i<veces;i++){//numero de veces que se hace
			
			for(int j=0; j<this.procesos;j++)
			{
				
				System.out.println("El proceso incrementador " +this.id +" ha llegado a la etapa " + j);
				
				this.mem.setIn(id, j);
				this.mem.setLast(j, id);
				
				
				System.out.println(mem+"\n");
				
				for(int k=0; k<this.procesos && k != id;k++)
				{
					while(this.mem.getIn(k)>=this.mem.getIn(id) && this.mem.getLast(j)==id);
				}
				
			}
			mem.incrementar(id);
			mem.setIn(id, -1);
		}
	}
	
	private int id;
	private int procesos;
	private int veces;
	private MemoriaCompartida mem;
}
