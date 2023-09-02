package poo;

public class Minumero {
	
	//atributos clase Minumero
	private double numero;
	private double valor;

	
	
	//Contructor sobrecargado
	public Minumero(double valor) {
		numero=valor;
		 }
	
	// Metodo 
	
	//public void dimeNumero() {
		//numero=valor;//Ojo el numero=valor se entiende como el numero que utilizamos es igual al valor que pasamos. 
	//}
	
	public double getdoble() {
		
		return numero*2;
	
	}
	
	public double getTriple() {
		
		return numero*3;
	}
	
	public double getCuatriple() {
		
		return numero*4;
	}
	
	
	
	
}
