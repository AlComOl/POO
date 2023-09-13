package poo;

import java.util.*;

public class Juego_E2 {
	
	//ATRIBUTOS
	
	private double aleatorio1;
	private double aleatorio2;
	//private double resutadoSuma;
	
	//CLASE 
	
	public Juego_E2() {
		
		aleatorio1=(Math.random()/100);
		aleatorio2=(Math.random()/100);
		
		
	}
	
	
	//METODOS
	
	public void menu() {
		
		System.out.println("Pulsa 1 ---> SUMA");
		System.out.println("Pulsa 2 ---> RESTA");
		System.out.println("Pulsa 3 ---> MULTIPLICACION");
		System.out.println("ELIGE UNA OPERACION");
	}
	
	public double calculaSuma() {
		
		double resultadoSuma;
		resultadoSuma=aleatorio1+aleatorio2;
		if(resultadoSuma >= 10 &&  resultadoSuma <= 99) {
			System.out.println("**");
		}else if(resultadoSuma >= 0 &&  resultadoSuma <= 9) {
			System.out.println("*");
		
		}
		return resultadoSuma;
	}
	
	
	//public double getSuma() {
		
		//return setSuma();
	//}
	
	
	

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int condicion = -1;
		
		Juego_E2 Juego = new Juego_E2();
		
		do {
		
		
		Juego.menu();
		int operacion=entrada.nextInt();
		
		switch (operacion) {
		case 1:
			Juego.calculaSuma();
		System.out.println(Juego.aleatorio1 + "+" + Juego.aleatorio2);	
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;

		default:
			break;
		}
		
		} while (condicion !=0);
	}

}
