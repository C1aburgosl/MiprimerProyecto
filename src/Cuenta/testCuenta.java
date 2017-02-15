package Cuenta;

import miLibreria.Entrada;

public class testCuenta {

	public static void main(String[] args) {

		Cuenta cuenta = new Cuenta();
		int opcion;
		boolean salir = false;
		Entrada entrada = new Entrada();
		
		/*Cuenta c1,c2,c3,c4;
		c1=new Cuenta();
		c2=new Cuenta();
		c3=new Cuenta();
		c4=new Cuenta();
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());*/

		do {

			System.out.println("1.Crear cuenta");
			System.out.println("2.Actualizar saldo");
			System.out.println("3.Ingresar dinero");
			System.out.println("4.Retirar dinero");
			System.out.println("5.Mostrar datos de la cuenta");
			System.out.println("0.SALIR");

			opcion = entrada.obtenerEntero("Elije una opción");

			if (opcion > 5 || opcion < 0) {
				System.out.println("Opcion no valida! Debe elegir una opcion entre 1 y 5 o 0 para salir");

			} else {

				switch (opcion) {

				case 1: {
					cuenta = new Cuenta(entrada.obtenerEntero("Introduce DNI"),
							entrada.obtenerEntero("Introduce el saldo"), entrada.obtenerEntero("Introduce intereses"));
					entrada.obtenerString("Pulse [Intro] para continuar");
				}
				case 2: {
					cuenta.actualizarSaldo();
					break;
				}
				case 3: {
					cuenta.ingresar(entrada.obtenerEntero("Introduce el dinero a ingresar"));
					break;
				}
				case 4: {
					cuenta.retirar(entrada.obtenerEntero("Introduce el dinero a retirar"));
					break;
				}
				case 5: {
					System.out.println(cuenta.toString());
					entrada.obtenerString("Pulse [Intro] para continuar");
					break;
				}
				case 0: {
					salir = true;
				}

				}
			}
		} while (!salir);
	}
}
