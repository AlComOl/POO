package poo;
import java.util.*;

public class Uso_finanzas {

	public static void main(String[] args) {
		// inicimamos las variables 
		Scanner entrada=new Scanner(System.in);
		String tipoMoneda ;
		double cantidadMoneda;
		double cambioMoneda;
		int decision;
		
		
		// introducimos datos por pantalla
		System.out.println("Que moneda quieres convertir?");
		tipoMoneda=entrada.next();
		System.out.println("Introduce el valor de que quieres convertir");
		cantidadMoneda=entrada.nextDouble();
		System.out.println("Quieres establecer un tipo de cambio? Presiona 1 para establecer cambio");
		decision=entrada.nextInt();
		
		Finanzas conversor = new Finanzas();	
		
		if (decision == 1) {
			System.out.println("Introduce el tipo de cambio");
			cambioMoneda=entrada.nextDouble();
			conversor=new Finanzas(cambioMoneda);
		    if(conversor.getMonedaTipo(tipoMoneda).equals("Dolar")) {
				System.out.println(conversor.dolaresToEuro(cambioMoneda));
			}else{
				System.out.println(conversor.euroToDolar(cambioMoneda));
			
		}	
			
		}if(decision != 1) {
			if(conversor.getMonedaTipo(tipoMoneda).equals("Dolar")) {
				System.out.println(conversor.dolaresToEuro(cantidadMoneda));
			}else{
				System.out.println(conversor.euroToDolar(cantidadMoneda));
			
		}
		}
		

	}
}
