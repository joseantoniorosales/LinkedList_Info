package linkedlist;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		
		LinkedList<String> nombres = new LinkedList<>();
		
		//A�adir elementos a la lista
		
		nombres.add("JoseAnt");
		nombres.add("Luis");
		nombres.add("Ana");
		nombres.add("Alejandra");
		
		//Mostrar primera lista
		
		for (String cont : nombres) {
			
			System.out.println(cont);
		}
		
		System.out.println();
		
		//A�adir elementos en la primera posici�n
		
		nombres.addFirst("Ramon");
		
		//Mostrar lista actualizada
		
		for (String cont : nombres) {
			
			System.out.println(cont);
		}
		
		System.out.println();
		
		//A�adir elementos en la ultima posicion
		
		nombres.addLast("Mario");
		
		//Mostrar lista actualizada 2
		
		for (String cont : nombres) {
			
			System.out.println(cont);
			
		}
		
		System.out.println();
		
		//A�adir un elemento a una posicion determinada
		
		nombres.add(3, "Lidia");
		
		//Mostrar lista actualizada 3
		
		for (String cont : nombres) {
			
			System.out.println(cont);
		}
		
		System.out.println();
		
		System.out.println("El tama�o de la lista es: " + nombres.size());
		
	}

}
