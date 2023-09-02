package clases;
import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		//Instanciar objeto y pasar parametros o atributos	
	Empleado empleado1 = new Empleado("Andres Marin",34000,1991,12,17);	
	
	Empleado empleado2 = new Empleado("Dolores Marin",44000,1992,12,17);	
	
	Empleado empleado3 = new Empleado("Maria Marin",49000,1993,01,01);
	
	//Aqui lo que hacemos por medio del metodo setter subir el sueldo a los empleados.
	empleado1.subeSueldo(5);
	empleado2.subeSueldo(5);
	empleado3.subeSueldo(5);
	
	
	System.out.println("Nombre: "+ empleado1.dameNombre()+ " Sueldo: "+empleado1.dameSueldo()+" Fecha de alta: "+empleado1.damefechaContrato());
	
	System.out.println("Nombre: "+ empleado2.dameNombre()+ " Sueldo: "+empleado2.dameSueldo()+" Fecha de alta: "+empleado2.damefechaContrato());

	System.out.println("Nombre: "+ empleado3.dameNombre()+ " Sueldo: "+empleado3.dameSueldo()+" Fecha de alta: "+empleado3.damefechaContrato());

	}

}

class Empleado{
	//Constructor 
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre=nom;
		sueldo=sue;
		//por medio de la api de java obtemos el metodo o funcion GregorianCalendar
		//Instanciamos un nuevo objeto de la api de java donde la pasamos año mes-1 porque
		//empieza desde y dia.
		GregorianCalendar caledario = new GregorianCalendar(agno, mes-1,dia);
		
		altaContrato = caledario.getTime();
	}
	
	//GETTER
	public String dameNombre() {
		return nombre;
	}
	public double dameSueldo() {
		return sueldo;
	}
	public Date damefechaContrato() {
		return altaContrato;
	}
	
	//SETTERS
	public void subeSueldo(double porcentaje) {
		double aumento= sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	//inicio atributos del constructor
	private String nombre ;
	private double sueldo ;
	private Date altaContrato ;
	
}
