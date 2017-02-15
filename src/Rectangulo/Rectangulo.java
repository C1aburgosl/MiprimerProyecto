package Rectangulo;

import Ejercicios.Complejo;

public class Rectangulo {
	private Complejo InferiorIzquierdo;
	private Complejo InferiorDerecho;
	private Complejo SuperiorIzquierdo;
	private Complejo SuperiorDerecho;
	
	public Rectangulo(){
	}
	public Rectangulo(Complejo II,Complejo ID,Complejo SI,Complejo SD){
		this.InferiorDerecho=ID;
		this.InferiorIzquierdo=II;
		this.SuperiorDerecho=SD;
		this.SuperiorIzquierdo=SI;
	}
	public Rectangulo(int base,int altura){
		this.InferiorDerecho=new Complejo(base,0);
		this.InferiorIzquierdo=new Complejo(0,0);
		this.SuperiorDerecho=new Complejo(altura,base);
		this.SuperiorIzquierdo=new Complejo(0,altura);
	}
	public double calcularArea(){
		return (InferiorDerecho.getImag()-InferiorIzquierdo.getImag())*(SuperiorIzquierdo.getReal()-InferiorIzquierdo.getReal());
	}
	
	public void desplazar(Complejo posicion){
		this.InferiorIzquierdo=posicion.suma(this.InferiorIzquierdo);
		this.InferiorDerecho=posicion.suma(this.InferiorDerecho);
		this.SuperiorDerecho=posicion.suma(this.SuperiorDerecho);
		this.SuperiorIzquierdo=posicion.suma(this.SuperiorIzquierdo);
	}
	
	public String toString(){
		return SuperiorIzquierdo.toString()+" "+SuperiorDerecho.toString()+"\n"+InferiorIzquierdo.toString()+" "+InferiorDerecho.toString();
	}
	
	
	
}
