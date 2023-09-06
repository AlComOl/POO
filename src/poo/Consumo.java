package poo;

public class Consumo {

		//Atributos 
		private double Kilometros;
		private double Litros;
		private double Vmed;
		private double Pgas;
	
		//clase Consumo
	
		public Consumo(double Kvalor, double Lvalor, double Vvalor ,double Pvalor){
			
			Kilometros= Kvalor;
			Litros=Lvalor;
			Vmed=Vvalor;
			Pgas=Pvalor;
			
		}

		//Métodos:
		//– getTiempo. Indicará el tiempo empleado en realizar el viaje.
	
		public double getTiempo() {
			double tiempo;
			return tiempo=Kilometros/Vmed;
		}
		
		//– consumoMedio. Consumo medio del vehículo (en litros cada 100 kilómetros).   
		
		//    distancia recorrida
		//	______________________
		//	Cantidad de combustible consumido  
		
		
		public double consumoMedio() {
			double cMedio;
			return	cMedio=Kilometros/Litros;
		
		}
		
		
		//– consumoEuros. Consumo medio del vehículo (en euros cada 100 kilómetros).
		
		public double consumoEuros() {
			double Euros;
			
			return Euros=(Kilometros/Litros)*Pgas;
		}
		
		//Para la clase anterior implementa los siguientes métodos, los cuales podrán modificar los valores de los atributos de la clase:
			// setKms
		
			public void setKm(double Kvalor) {
				
				Kilometros=Kvalor;
			}
			// setLitros
			// setVmed
			// setPgas
		
		
	public static void main(String[] args) {
		
		Consumo omusnoc = new Consumo(30,5,100,1.34);
		
		System.out.println(omusnoc.getTiempo()); 
		
		System.out.println("El consumo medio es " + omusnoc.consumoMedio()+ " L/100KM"); 
		
		System.out.println("El consumo en Euros" + omusnoc.consumoEuros()+ " Euros/100KM"); 
		System.out.println("************************************setKms********************************");
		omusnoc.setKm(50);
		
		System.out.println(omusnoc.getTiempo());
	}

}
