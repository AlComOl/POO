package poo;

public class Millas {
	
	private double metros;
	private double resultado;
	
	//CONSTRUCTOR
	public Millas() {
		metros=1850;
		
	
	}
	//Metodo setter para convertir a metros
	public void millasAMetros(double millasMarinas) {
		resultado=millasMarinas*metros;
	}
	//Metodo getter para mostrar el valor
	public double getmetros() {
		return resultado;
	}
	//Metodo gter para mostrar el valor en Kilometros
	public double getKilometros() {
		return resultado/1000;
	}



	public static void main(String[] args) {
		
		
		// INSTANCIA
		Millas sallim = new Millas();
		
	//Setter pasando el valor de las millas marinas
	    sallim.millasAMetros(15);
	    
	    
	    System.out.println("El valor introducido en Millas marinas son " + sallim.getmetros()+" metros");
	    System.out.println("***********************************************************");
	    System.out.println("El valor introducido en Millas marinas son " +sallim.getKilometros()+ " Kilometros");
	    
			
			

	}

}
