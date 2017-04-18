package Models;

public class PruebaMetodos {

	public static void main(String[] args) {
		Cola2<String> Numeros = new Cola2<String>();
		
		Numeros.add("2");
		Numeros.add("21");
		Numeros.add("22");
		Numeros.add("3");
		Numeros.add("1");
		Numeros.getCurrent(3);
		Numeros.getNext(2);
		Numeros.setIndex(5);
		Numeros.getPrev(0);
		Numeros.remove("3");
		
		
		
	}
	

}
