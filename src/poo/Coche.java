package poo;


public class Coche  {
	private int ruedas,largo,ancho,peso_plataforma,alto;
	private int techo_solar;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;

	//método constructor
	public Coche() {
		//propiedades
       ruedas=4;
	   largo=2000; 
	   ancho=1600;
       peso_plataforma=500;
       alto=50;
       techo_solar=1;
       color="amarillo";
	
       
	}
	
	
	//public int dime_largo() {//getter
		//return largo;
	//}
	//Metodos getter y setter para establece color||con estos metodos permitimo que si el atributo es private se pueda obtener o modificar el color 
	public void establece_color(String color_coche) {//SETTER
		
		color=color_coche;
		
	}
	public String establece_color() {//SETTER
		
		return color;
		
	}
	//Metodos getter y setter para establece peso||
	public int dime_peso() {
		
		return peso_total;
	}
	
	public void establece_peso(int peso_coche) {
		
		peso_total=peso_coche;
		
	}
	
	//getter de alto para obtener el alto
	
	public int dime_alto() {
		return alto;
		
	}
	
	//setter para modificar el valor de alto y modificarlo
	public void  establece_alto(int alto_coche) {
		alto=alto_coche;
	}
	//Funcion para que me devuelva los datos generales de la plataforma
	
	public String dime_datos_generales() {
		return "La plataforma del vehiculo tiene " + ruedas +" ruedas"+" .Mide "+largo/1000+ " metros con un ancho de " + ancho +" cm y un peso de la platoaforma "+ peso_plataforma+ " Kg";
	}
	
//Metodo para definir los asientos del coche
	//SETTER
	public void dime_configuracion_asientos(String asientos_cuero) {
		
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
		
	}
	//GETTER
	public String devuelve_asientos() {
		 if(asientos_cuero==true) {
			 return "El coche lleva asientos de cuero";
		}else { 
			return "El coche lleva sientos de serie";
		}
	}
//Metodo para estableces si lleva climatizador o aire acondicionado
	//SETTER
	public void establece_climatizador(String climatizador) { //SETTER
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
		
	}
	//GETTER
	public String dime_climatizador() {
		if(climatizador==true) {
			return "El coche lleva climatizador";
			
		}else {
			return "El coche lleva aire acondicionado";
		}
	}
	
	//Metodo getter/setter para establecer un peso al coche 
	//este metodo por un lado establece y por otro optien esta practica no se realiza y no esta recomendada
	
		public String dime_Peso_Total_Coche() {
		
				int peso_carroceria=500;
				peso_total=peso_plataforma+peso_carroceria;
		
					if(asientos_cuero==true) {
						peso_total+=50;
					}
					if (climatizador==true) {
						peso_total+=20;
					}
					
					return "El peso del coche es "+ peso_total;
	}
		
	//Metodo setter/getter que establece el precio del coche suamdo si tiene climatizados y asientos de cuero.
		
		public String dime_precio_coche(){
			int precio_final=10000;
			
			if(asientos_cuero==true) { 
				precio_final+=2000;
			}
			if(climatizador==true) {
				precio_final+=1500;
			}
			return "El precio de final del coche son: "+ precio_final;
		
}
}
	