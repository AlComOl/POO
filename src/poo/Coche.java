package poo;


public class Coche  {
	private int ruedas,largo,ancho,peso_plataforma,alto;
	
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climetizador;
	
	//método constructor
	public Coche() {
		//propiedades
       ruedas=4;
	   largo=2000; 
	   ancho=1600;
       peso_plataforma=500;
       alto=50;
	
       
       
	}
	//public int dime_ruedas(){//getter
 	//  return + ruedas;
    //}
	//public int dime_largo() {//getter
		//return largo;
	//}
	
	public void establece_color(String color_coche) {//setter
		
		color=color_coche;
		
	}
	public String dime_color() {//getter
		
		return color;
		
	}
	public int dime_peso() {
		
		return peso_total;
	}
	
	public void establece_peso(int peso_coche) {
		
		peso_total=peso_coche;
		
	}
	
	//getter de alto para obtener el valor
	
	public int dime_alto() {
		return alto;
		
	}
	
	//setter para modificar el valor de alto y pasarlo por referencia
	public void  establece_alto(int alto_coche) {
		alto=alto_coche;
	}
	
}
