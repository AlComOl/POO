package poo;

public class Pepito {

	  private double cambioUsdEur, importe;

	    // Constructor por defecto
	    public Pepito(){
	        cambioUsdEur= 1.36; // 1$ = 1.36€.
	    }

	    // Constructor (double)
	    public Pepito(double input){
	        cambioUsdEur=input;
	    }

	    // Setter para almacenar la cantidad introducida
	    public void setCantidad(double importeMetido){
	        this.importe=importeMetido;
	    }
	    
	    public double dolaresToEuros(double dolaresIntroducidos){
	        return dolaresIntroducidos*this.cambioUsdEur;
	    }

	    public double eurosToDolares(double eurosIntroducidos){
	        return eurosIntroducidos/this.cambioUsdEur;
	    }
	}

