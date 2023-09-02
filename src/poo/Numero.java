package poo;



public class Numero {
	
	
	public static void main(String[] args) {
		
		Numero oremun = new Numero();
		//sumarle un número al valor interno.
		oremun.sumanumero(3);
		System.out.println(oremun.getValor());
		//resta un nnumero al valor interno
		oremun.restanumero(1);
		System.out.println(oremun.getValor());//Devuelve el valor interno
		//Devuelve el doble del valor interno.
		System.out.println(oremun.getDoble());
		//Devuelve el triple del valor interno.
		System.out.println(oremun.getTriple());
		//Inicializa de nuevo el valor interno.
		oremun.setNumero();
		System.out.println(oremun.getValor());
		
	}
	
	
	
	private double entero;
	//CONSTRUCTORES
	//Constructor por defecto que inicializa a 0 el número interno.
	public Numero() {
		entero=0;
	}
	//Constructor que inicializa el número interno.
	public Numero(double valor) {
		entero=valor;
	}
	
	
	//METODOS
	//Método aniade que permite sumarle un número al valor interno.
	public void sumanumero(double valor) {
		entero+=valor;
	}
	//Método aniade que permite restar un número al valor interno.
	public void restanumero(double valor) {
		entero-=valor;
	}
	//Método getValor. Devuelve el valor interno.
	
	public double getValor() {
		return entero;
	}
	//Método getDoble. Devuelve el doble del valor interno.
	public double getDoble() {
		return entero*2;
	}
	//Método getTriple. Devuelve el triple del valor interno.
	public double getTriple() {
		return entero*3;
	}
	
	//Método setNumero. Inicializa de nuevo el valor interno.
	
	public void setNumero() {
		entero=0;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
