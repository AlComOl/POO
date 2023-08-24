package poo;

public class Finanzas {
	//tengo que crear los atributos de la clase temperatura
	
	private String tipoMoneda;
	private double cambio;
	

	//creamos el metodo constructor

	public Finanzas() {//constructor para el tipo de cambio que es fijo
		cambio=1.36; //un euro equivale a 1.36 dolares
	
		}
	public Finanzas (double valor) {
		cambio=valor;

	}
	
	// Creamos los Metodos
	
		public double euroToDolar(double cantidadMoneda) {//cantidadMoneda es el valor que pasamos desde el main, cambio es el valor que establecemos en el constructor 
			return cantidadMoneda*cambio;
		}
		public double dolaresToEuro(double cantidadMoneda) {
			return cantidadMoneda/cambio;
		}
		
		public String getMonedaTipo(String tipoMoneda) {
			return tipoMoneda;
		}
	
		
		
		
		
		
}