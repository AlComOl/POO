package poo;
import java.util.*;
public class Uso_temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double entradaTemperatura;
		String entradaTipo;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Que vas a meter? Farenheit o Celsius");
		entradaTipo = tec.next();
		System.out.println("Cuantos grados?");
		entradaTemperatura = tec.nextDouble();
		
		Temperatura prueba = new Temperatura(entradaTemperatura, entradaTipo);
		
		if(prueba.getGrados().equals("Celsius")){ // .equals sirve para comparar Strings
			System.out.println(prueba.celsiusToFarenheit());
		}else {
			 System.out.println(prueba.farenheitToCelsius());
		}
		
		//System.out.println("Te has equivocado, cambia temperatura");
		//entradaTemperatura = tec.nextDouble();
		//prueba.setTemperatura(entradaTemperatura);
	}

}
