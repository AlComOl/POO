package poo;

public class Temperatura {
//definir las variables
	private double temperatura;
	private String grados;
	
	//metodo constructor
	public Temperatura(double valor, String tipo){
		
		temperatura=valor;
		grados=tipo;
		
	}

	public double celsiusToFarenheit() {
		return temperatura * 1.8 + 32;
	}
	
	public double farenheitToCelsius() {
		return (temperatura -32)*1.8;
	}
	
	public String getGrados() {
		return grados;
	}
	
	//public void setTemperatura(double entrada) {
	//	temperatura = entrada;
	//}
}
