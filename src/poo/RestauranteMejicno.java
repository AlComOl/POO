package poo;
import java.util.*;


public class RestauranteMejicno {
	//private double papas;
	//private double chocos;
	private double Kpapas;
	private double Kchocos;
	
	
 public RestauranteMejicno() {
	 Kpapas=0;
	 Kchocos=0;
 }
//	public void addChocos(int x): Añade x kilos de chocos a los ya existentes.
	
	public void addChocos(double addChocos) {
		Kchocos+=addChocos;
		
	}
//	public void addPapas(int x): Añade x kilos de papas a los ya existentes. 
// 
	
	public void addPapas(double addPapas) {
		Kpapas+=addPapas;
		
	}
//Pasamos por parametro de la funcion los chocos y las papas acumulandolos en Kchocos y Kpapas 
	public void setClientes(double valorPapas, double valorChocos) {
		Kpapas=valorPapas;
		Kchocos=valorChocos;
		
	}
	
//public int getComensales(): Devuelve el número de clientes que puede atender el restaurante 
//(este es el método anterior).
	
	public String getComensales() {
		return  "Con la cantidad de PAPAS que tenemos en el restaurante podemos cocinar papas para " + Kpapas*3 +" personas y de CHOCOS para "+ (Kchocos*3)/0.5 + " personas";
	}

	
//	public void showChocos(): Muestra por pantalla los kilos de chocos que hay en el almacen.	
	
	public double showChocos() {
		
	return Kchocos;
	}
	
	public double showPapas() {
		
	return Kpapas;
	
	}
	
	
	

	

	
	
	public static void main(String[] args) {
		
		Scanner Entrada=new Scanner(System.in);
		
		int opcion = -1;
		
		RestauranteMejicno restauranteIsrael = new RestauranteMejicno();
		
	  do {
		System.out.println("  1 -> Ingresar productos en el Almacen "
				+ "\n  2 -> Ver Stock Almacen  "
				+ "\n  3 -> Ver cantidad de clientes que puedo antender con el Stock del almacen "
				+ "\n  0 -> Salir");
		opcion=Entrada.nextInt();
		switch (opcion) {
		case 1:
		
				System.out.println("  1 -> Introducir Chocos  "
									+ "\n  2 -> Introducir Papas   "
									+ "\n  3 -> Salir ");
				
				int producto=Entrada.nextInt();
				switch(producto) {
				case 1:
					double cantidadChocos;
					do {
					System.out.println("Introduce Chocos");
					cantidadChocos=Entrada.nextDouble();
					restauranteIsrael.addChocos(cantidadChocos);
					} while (cantidadChocos<0);
					System.out.println("Comfirmado");
					
				break;
				case 2:
					
					double cantidadPapas;
					do {
						System.out.println("Introducir Papas");
						cantidadPapas=Entrada.nextDouble();
						restauranteIsrael.addPapas(cantidadPapas);
					} while (cantidadPapas<0);
					 	System.out.println("Comfirmado");
				
				break;
				case 3:
					
				break;
				default:
					System.out.println("Opcion no valida");
					break;
				}
				break;
			
		case 2:
			System.out.println("Ver Stock en el almacen \n 1 -> Ver Chocos \n 2 -> Ver Papas  \n 3 -> Salir");
			int ver=Entrada.nextInt();
			switch(ver) { 
			case 1:
				System.out.println(restauranteIsrael.showChocos());
			break;
			case 2:
				System.out.println(restauranteIsrael.showPapas());
			break;
			case 3:
				System.out.println("Salir");
			break;
			}
			break;
		case 3:
			System.out.println(restauranteIsrael.getComensales());
			break;
		case 0:
			System.out.println("Adios");
		default:
			break;
		
			}
		
	  }while(opcion != 0);
	}
}

