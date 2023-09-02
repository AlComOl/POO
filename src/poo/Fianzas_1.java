package poo;

public class Fianzas_1 {
	private double cambioUsdEur, importe;

    // Constructor por defecto
    public Fianzas_1(){
        cambioUsdEur= 1.36; // 1$ = 1.36€.
    }

    // Constructor (double)
    public Fianzas_1(double input){
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

