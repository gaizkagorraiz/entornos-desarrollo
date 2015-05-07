/**
 * 
 */
package org.cuatrovientos.vector;

import java.util.Vector;
/**
 * @author PC
 *
 */
public class VectorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<String> books = new Vector<String>(); //Crear un vector
		
		//Añadir elementos al vector, como si fuese un array
		books.add("El juego de Ender");
		books.add("El señor de los anillos");
		books.add("Harry Potter");
		
		System.out.println(books.elementAt(1)); //Mostrara "El juego de Ender"
		books.set(0, "El codigo da Vinci"); //Pone en la posicion 0 que hasta ahora era "El juego de Ender" a "El codigo da vinci"
		System.out.println(books.elementAt(0)); 
		
		//Para recorrer los elementos utilizando el indice
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.elementAt(i));
		}
		//Igual que el anterior (para recorrer los elementos, en este caso no utiliza el indice sino que da a la variable book un valor cada vez
		for (String book: books) {
			System.out.println(book);
		}
		
		//Primero se decalaran los libros y luego se añaden
		Vector<Book> myBooks = new Vector<Book>();
		Book oneBook = new Book("Los pilares de la tierra","Ken Follet");
		Book otherBook = new Book("El lazarillo de Tormes","Desconocido");
		
		myBooks.add(oneBook);
		myBooks.add(otherBook);
		
		//Lo mismo que lo anterior pero en un paso
		myBooks.add(new Book("Dune","F. Herbert"));
	
		for (Book book: myBooks) {
			System.out.println(book.toString());
		}
	}

}
