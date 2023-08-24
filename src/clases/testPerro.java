package clases;

public class testPerro {

	public static void main(String[] args) {
		perro a = new perro();//ISTANCIAR
		perro b = new perro();
		perro c= new perro();
		
		System.out.println(a.getRaza());
		
		a.getEdad();
		b.getPeregri();
		c.getRaza();
		
		a.setRaza("Caniche");
		
		System.out.println(b);
		
	}

}
