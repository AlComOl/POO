package poo;

public class Uso_coche {

		public static void main(String[] args) {
			
			//Instacia del objeto Coche que llama al un constructor que la pasa lo parametros a traves del constructor
			coche coche1 = new coche("Audi" ,"A3","Deportivo");
			//Instacia del objeto Coche que llama al un constructor normal 
			coche coche2 = new coche();
			
			
			//coche1.setcoche("Mercedes", "C5", "Turismo");		
			
			//System.out.println(coche1.getCoche());	
			
			
			//coche2.setcoche(null, null, null);
			
			//System.out.println(coche2.getCoche());
			System.out.println("LLAMADA AL PRIMER CONSTRUCTOR");
			System.out.println(coche1.getCoche());
			
			System.out.println("*************************************************************************************************");
			System.out.println("LLAMADA AL SEGUNDO  CONSTRUCTOR");
			System.out.println(coche2.getCoche());
	}
}
