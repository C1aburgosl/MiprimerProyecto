package Coche;

public class Motor {
	
	private String motor;
	
	public Motor(){
		this.motor=("Motor apagado");
	}
	
	
	public void arrancar(String arranque){
		this.motor=("Motor arrancado");
	}
	public void apagar(String arranque){
		this.motor=("Motor apagado");
	}
	

}
