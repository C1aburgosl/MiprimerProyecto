package Linea;

import Ejercicios.Complejo;

public class Linea {
	private Complejo puntoA;
	private Complejo puntoB;
	
	public Linea(){
	}
	
	public Linea(Complejo A,Complejo B){
		this.puntoA=A;
		this.puntoB=B;
	}
	
	public void mueveDerecha(int posicion){
		Complejo s=new Complejo(posicion,0);
		this.puntoA=this.puntoA.suma(s);
		this.puntoB=this.puntoB.suma(s);
		
	}
	public void mueveInquierda(int posicion){
		Complejo r=new Complejo(0,posicion);
		this.puntoB=this.puntoB.resta(r);
		this.puntoA=this.puntoA.resta(r);
		
	}
	public void mueveArriba(int posicion){
		Complejo s=new Complejo(0,posicion);
		this.puntoB=this.puntoB.suma(s);
		this.puntoA=this.puntoA.suma(s);
		
	}
	public void mueveAbajo(int posicion){
		Complejo r=new Complejo(posicion,0);
		this.puntoB=this.puntoB.resta(r);
		this.puntoA=this.puntoA.resta(r);
		
	}
	
	public Complejo getA(){
		return puntoA;
	}
	
	public void setA(Complejo puntoA){
		this.puntoA=puntoA;
	}
	
	public Complejo getB(){
		return puntoB;
	}
	
	public void setB(Complejo puntoB){
		this.puntoB=puntoB;
	}
	
	public String toString(){
		return puntoA.toString()+","+puntoB.toString();
	}
	

}
