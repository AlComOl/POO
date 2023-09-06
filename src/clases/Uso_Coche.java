package clases;

import javax.swing.*;

public class Uso_Coche {

	public static void main(String[] args) {
		Coche Audi =new Coche();//Instanciar una clase 
		
		
		Audi.establece_color(JOptionPane.showInputDialog("Introduce color"));
		
		Audi.establece_peso(2000);
		
		Audi.establece_alto(100);
		
		Audi.dime_configuracion_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));

		Audi.establece_climatizador(JOptionPane.showInputDialog("Tiene clinatizador?"));
		
		

	System.out.println(Audi.establece_color());
	System.out.println(Audi.dime_peso());
	System.out.println(Audi.dime_alto());
	
	
	System.out.println(Audi.dime_datos_generales());
	
	System.out.println(Audi.devuelve_asientos());
	
	System.out.println(Audi.dime_climatizador());
	
	System.out.println(Audi.dime_Peso_Total_Coche());
	
	System.out.println(Audi.dime_precio_coche());
	}

}
