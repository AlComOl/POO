package poo;

public class Peso {
	
	private double peso;
	
	
	//constructor
	
	//dentro de el pasamos el valor a Kilogrmaos y lo guardamos en peso dependiendo de la unidad que introduzcamos como parametros por eso las condiciones.
	
	// de esta manera hacemos 7 condiciones, ya que tenemos el Obgeto en kilogrmaos en el valor del constructor PESO independientemente de la unidad que introduzcamos.
	
	public Peso(double valor ,String unidad) {
		peso = valor;
				
		if(unidad.equalsIgnoreCase("Lb")) {
			
			peso=valor*0.453;
		}
		if(unidad.equalsIgnoreCase("Li")) {
			
			peso=valor*14.59;
		}
		if(unidad.equalsIgnoreCase("Oz")) {
			
			peso=valor*0.02435;
		}
		if(unidad.equalsIgnoreCase("P")) {
			
			peso=valor*0.00155;
		}
		if(unidad.equalsIgnoreCase("K")) {
			
			peso=valor;
		}
		if(unidad.equalsIgnoreCase("G")) {
			
			peso=valor/1000;
		}
		if(unidad.equalsIgnoreCase("Q")) {
			
			peso=valor*43.3;
		}
	}
	
	
	//Metodos
	//getLibras. Devuelve el peso en libras.
			public double getLibras () {
				
				
				return peso/0.453;
				
			}
			
	//getLingotes. Devuelve el peso en lingotes.
			
			public double getLingotes() {
				
				
				return peso/14.59;
			}
			
	//getPeso. Devuelve el peso en la medida que se pase como parámetro
			//si es igual a cada una de las siglas efectua un calculo para acumularlo en alvaro y mostrarlo por pantalla
			
			
			public double getPeso(String parametro) {
				
				double alvaro=0;
				
				if(parametro.equalsIgnoreCase("Lb")) {
					
					alvaro=peso/0.453;
				}
				if(parametro.equalsIgnoreCase("Li")) {
					
					alvaro=peso*14.59;
				}
				if(parametro.equalsIgnoreCase("Oz")) {
					
					alvaro=peso*0.02435;
				}
				if(parametro.equalsIgnoreCase("P")) {
					
					alvaro=peso*0.00155;
				}
				if(parametro.equalsIgnoreCase("K")) {
					
					alvaro=peso;
				}
				if(parametro.equalsIgnoreCase("G")) {
					
					alvaro=peso*1000;
				}
				if(parametro.equalsIgnoreCase("Q")) {
					
					alvaro=peso*43.3;
				}
				
				return alvaro;
			}
				
		
			
		public static void main(String[] args) {
						
						
					
			
			//Instancia
				Peso osep = new Peso(1 ,"Lb");
						
						
		 System.out.println(osep.getLibras()+" Libras");
		 System.out.println("************************************************************");
		 System.out.println(osep.getLingotes()+" Lingotes");
		 System.out.println("***********************Devuelve el peso en la medida que hayamos pasado como parametro en la funcion************************************");
		 System.out.println(osep.getPeso("G"));
		
		}
	}


