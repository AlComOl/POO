package poo;

public class TestUsusario {

	public static void main(String[] args) {
		
		Usuario Alvaro= new Usuario("Alvaro", "Comenge");
		
		
		Alvaro.crearUsuario("Alvaro");
		Alvaro.crearPassword("Comenge");
		
		System.out.println(Alvaro.getUsuario());
		System.out.println(Alvaro.getPassword());
		
		System.out.println(Alvaro.confirmaCredenciales("Andres", "Comenge"));

	}

}
