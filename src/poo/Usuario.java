package poo;

public class Usuario {
	//ATRIBUTOS
	private String Usser;
	private String Password;
	//CONSTRUCTOR
	public Usuario(String Us, String Pass) {
		
		Usser=Us;
		Password=Pass;
		
	}
	
	//METODOS
	
	public void crearUsuario(String Us) {
		Usser=Us;
	}
	public void crearPassword(String Pass) {
		Password=Pass;
	}
	public String getUsuario() {
		return Usser;
	}
	public String getPassword() {
		return Password;
	}
	
	public void resetUsusario() {
		Usser= " ";
		Password=" ";
		
	}
	public boolean confirmaCredenciales(String Us,String Pass) {
		boolean resultado=true;
		if(Us.equals(Usser)&&Pass.equals(Password)) {
		resultado=true;
		}else {
			resultado=false;
		}
	return resultado;
	}
}
