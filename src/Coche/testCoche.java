package Coche;

import miLibreria.Entrada;

public class testCoche {
	public static void main(String[] args) {
		int opcion;
		boolean salir = false;
		Entrada entrada = new Entrada();
		
		do{
		  System.out.println("1.Motor");
		  System.out.println("2.Rueda");
		  System.out.println("3.Ventana");
		  System.out.println("4.Puerta");
		  System.out.println("5.Ver coche");
		  System.out.println("0.SALIR");
		  System.out.println();
		  
		  opcion = entrada.obtenerEntero("Elije una opción");
		  System.out.println();
		  
		  switch (opcion) {

			case 1: 
			{
				int motor;
				do{
				  System.out.println("1.Arrancar motor");
				  System.out.println("2.Apagar motor");
				  System.out.println("0.SALIR");
				  
				  motor = entrada.obtenerEntero("Elije una opción");
				  System.out.println();
				  
				  switch (motor) {
				  	case 1: {
				  		Motor.arrancar(); 
				  	}
				  	case 2: {
						Motor.apagar(); 
				  	}
				  	case 0: {
				  		salir = true;
				  	}
				  
				  }
				  
				} while (!salir);
				
			}
			case 2: 
			{
				
				
			}
			case 3: {
				
				
			}
			case 4: {
	
			}
			case 5: {
				
			}
			
			
			case 0: {
				salir = true;
			}
		  }
			
			
		} while (!salir);
		 
		 
		 
		 
		}

	}

}
