package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		Coche Audi =new Coche();//Instanciar una clase 
		
	
		Audi.establece_color("amarillo");
		
		Audi.establece_peso(2000);
		
		Audi.establece_alto(100);
		
		
	System.out.println(Audi.dime_color());
	System.out.println(Audi.dime_peso());
	System.out.println(Audi.dime_alto());
	}

}
