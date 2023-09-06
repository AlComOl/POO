package poo;

public class coche {

		//CONSTRUCTORES
	
	private String marca;
	private String modelo;
	private String clase;
	
	//primer constructor que pasa valores
	public coche(String valor, String valor1,String valor2) {
		
		marca= valor;
		modelo=valor1;
		clase=valor2;
		
	}
	//segundo constructor normal
	
	public coche() {
		marca= "Citroen";
		modelo="Parner";
		clase="Furgoneta";
		
	}
	
	//Getter
	
	public String getMarca() {
		return "La marca de coche es: "+marca+"El modelo es "+ modelo +"y el tipo o modelo es. "+ modelo;
	}
	
	
	//Setter coche1 -> pasa los pareametros cuando llamamos a la funcion en el main
	public void setcoche(String valor,String valor1,String valor2) {
		
		marca= valor;
		modelo=valor1;
		clase=valor2;
	
	}
	//Setter -> devuelve los valores que con la cuando llamamos a la funcion getter en el main.
	public String getCoche() {
		return "La marca de coche1 es : " + marca + " el modelo del coche es " +modelo+ " el tipo es "+ clase +".";
	}
}
