package Ejercicios;

public class Racional {
	
	private int denominador;
	private int numerador;

	
	public Racional(int numerador, int denominador){
		this.numerador=numerador;
		this.denominador=denominador;
	}
	public Racional(Racional c){
		this.numerador=c.numerador;
		this.denominador=c.denominador;
	}
	
	
	public int getNumerador(){
		return numerador;
	}
	
	public int getDenominador(){
		return denominador;
	}
	
	public void setNumerador(int numerador){
		this.numerador=numerador;
	}
	
	public void setDenominador(int denominador){
		this.denominador=denominador;
	}
	
	public Racional suma (Racional c){
		return new Racional(numerador*c.denominador+denominador*c.numerador , denominador*c.denominador);
	}
	
	public Racional resta (Racional c){
		return new Racional(this.suma(c.multiplicacion(new Racional(-1,1))));
	}
	
	public Racional multiplicacion (Racional c){
		return new Racional(numerador*c.numerador , denominador*c.denominador);
	}
	
	public Racional division (Racional c){
		return new Racional(numerador*c.denominador,denominador*c.numerador);
		
	}
	
	
	
	

}
