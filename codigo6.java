package codigoOtros6;

import java.util.Scanner;
//El código genera un arreglo de 20 números aleatorios entre 20 y 400, y luego resalta los múltiplos de 5 o 7

public class codigo6 {
	// Se agregó el método main
	public static void main(String[] args) {
        int[] n = new int[20]; // Se debe inicializar con tamaño 20
        Scanner scanner = new Scanner(System.in); // Se agregó el Scanner

	    for (int i = 0; i < 20; i++) { // Faltaba agregar otro + para incrementar
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.println(n[i] + " "); //Faltaba poner .out
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? "); // Faltó agregar una "n" a println
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    //int opcion = Integer.parseInt(System.console().readLine()); //Faltaba un parentesis
	    int opcion = scanner.nextInt(); // // Se agregó Scanner
	    
	    
	    int multiplo = (opcion == 1) ? 5 : 7; // el operador ternario estaba al reves
	    
	    //Es un for
	    for (int e : n) { // Es un int en vez de un char
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      }else { //faltaba una llave para cerrar el if
	        System.out.print(e + " "); //Se utiliza out
	      }
	    }
		  
	    scanner.close();
	}
}
