package Linea;
import Ejercicios.Complejo;


public class testLinea {
	public static void main(String[] args) {
		
		Linea l=new Linea (new Complejo(0,0),new Complejo(1,1));
		System.out.println(l.toString());
		l.mueveDerecha(3);
		System.out.println("mueve 3 a la derecha "+l.toString());
		l.mueveInquierda(3);
		System.out.println("mueve 3 a la izquierda "+l.toString());
		l.mueveArriba(3);
		System.out.println("mueve 3 arriba "+l.toString());
		l.mueveAbajo(3);
		System.out.println("mueve 3 abajo "+l.toString());
		
	}
}
