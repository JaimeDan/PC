package pr3Parte3;


public class Producto {
	
	
	public void generar(){
		this.info = num;
		num++;
	}
	
	public String toString(){
		return ""+this.info;
	}
	
	private static int num=1;
	private int info = 0;
}
