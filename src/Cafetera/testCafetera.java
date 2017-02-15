package Cafetera;


import miLibreria.Entrada;

public class testCafetera {
	public static void main(String[] args) {

		cafetera Cafetera = new cafetera();
		int opcion;
		boolean salir = false;
		Entrada entrada = new Entrada();
		
		do {
			System.out.println();
			System.out.println("1.Crear cafetera");
			System.out.println("2.Llenar cafetera");
			System.out.println("3.Servir taza");
			System.out.println("4.Vaciar cafetera");
			System.out.println("5.Agregar cafe");
			System.out.println("6.Ver cafetera");
			System.out.println("0.SALIR");
			System.out.println();

			opcion = entrada.obtenerEntero("Elije una opción");
			System.out.println();

			if (opcion > 6 || opcion < 0) {
				System.out.println("Opcion no valida! Debe elegir una opcion entre 1 y 6 o 0 para salir");

			} else {

				switch (opcion) {

				case 1: {
					Cafetera = new cafetera(entrada.obtenerEntero("Introduce la cantidad maxima"),
							entrada.obtenerEntero("Introduce la cantidad actual"));
					entrada.obtenerString("Pulse [Intro] para continuar");
				}
				case 2: {
					Cafetera.llenarCafetera();
					System.out.println("Llenando cafetera...");
					break;
				}
				case 3: {
					Cafetera.servirTaza(entrada.obtenerEntero("Introduce la capacidad de la taza"));
					break;
				}
				case 4: {
					Cafetera.vaciarCafetera();
					System.out.println("Vaciando cafetera...");
					break;
				}
				case 5: {
					Cafetera.agregarCafe(entrada.obtenerEntero("Introduce la capacidad de cafe a agregar"));
					break;
				}
				case 6: {
					System.out.println(Cafetera.toString());
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
