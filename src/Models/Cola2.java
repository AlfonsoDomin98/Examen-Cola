package Models;

import java.util.Arrays;

public class Cola2<T> {
	// ATRIBUTO
	private T[] elementos;
	private int index;
	
	// CONSTRUCTOR
	public Cola2(){
		
	}
	
	// MÉTODOS
	/**
	 * Se añade una reserva de memoria para añadir el elemento y se le posiciona al final de la lista, quedando el index
	 * como la posicion que ocupa dicho elemento
	 *
	 * @param element
	 */
	public void add(T element){
		int Capacidad = this.elementos.length + 1;
		this.elementos = Arrays.copyOf(this.elementos, Capacidad);
		this.elementos[this.elementos.length-1]=element;
		this.elementos[index] = element;
	}
	
	/**
	 * Se redimensiona el array, eliminando el elemento y el index es la posicion donde se encontraba dicho elemento.
	 * @param element
	 */
	
	public void remove(T element){
			this.elementos=Arrays.copyOf(this.elementos, this.elementos.length-1);
			this.elementos[this.elementos.length+1]=element;	
			this.elementos[index] = element;
	}
	
	/**
	 * Mientas index + 1 sea mayor que elementos.length, se va restando a index el numero de elementos a elementos y una vez
	 * sea mas pequeño devolvera la el elemento siguiente del index
	 * @return
	 */
	public T getNext(int index){
		if(index +1 >= this.elementos.length){
		do{
			index = (index +1)- this.elementos.length;
		}
		while(index + 1>this.elementos.length);
		return this.elementos[index + 1];
		}
		else{
		return this.elementos[index + 1];
		}
	}
	
	/**
	 * Mientas index -1 sea mayor que elementos.length, se va restando a index el numero de elementos a elementos y una vez
	 * sea mas pequeño devolvera el elemento anterior del index
	 * @return
	 */
	public T getPrev(int index){
		if(index -1 >= this.elementos.length){
			do{
				index = (index - 1)- this.elementos.length;
			}
			while(index - 1>this.elementos.length);
			return this.elementos[index - 1];
		}
		else if(index -1 > 0){
			index = (index - 1) + this.elementos.length;
			return this.elementos[index];
		}
		else{
			return this.elementos[index - 1];
		}
	}
	
	/**
	 * Devolvera el elemento que se escoja del index, si el index es mayor que elementos.length e va restando a index 
	 * el numero de elementos a elementos y una vez sea mas pequeño devolvera el elemento correspondiente al index
	 * 
	 * @return
	 */
	public T getCurrent(int index){
		if(index>= this.elementos.length){
			do{
				index = index - this.elementos.length;
			}
			while(index >this.elementos.length);
			return this.elementos[index];
			}
			else{
			return this.elementos[index];
			}
	}
	/**
	 * Si i es menor que elementos.length mostrara i, si no mostrara -1
	 * @param i
	 * @return
	 */
	public int setIndex(int i){
		if(i>elementos.length){
			return -1;
		}
		else{
		return i;
		}
	}

}
