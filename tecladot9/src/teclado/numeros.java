package teclado;
import java.util.ArrayList; 
import java.util.Random; 
import java.util.Scanner; 
public class numeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in).useDelimiter("\r") ; 
		Random rand = new Random(); 
		char c; 
		ArrayList letras = new ArrayList(); 
		ArrayList numeros = new ArrayList(); 
		numeros.add(2);
		numeros.add(22);
		numeros.add(222);
		numeros.add(3);
		numeros.add(33);
		numeros.add(333);
		numeros.add(4);
		numeros.add(44);
		numeros.add(444);
		numeros.add(5);
		numeros.add(55);
		numeros.add(555);
		numeros.add(6);
		numeros.add(66);
		numeros.add(666);
		numeros.add(7);
		numeros.add(77);
		numeros.add(777);
		numeros.add(7777);
		numeros.add(8);
		numeros.add(88);
		numeros.add(888);
		numeros.add(9);
		numeros.add(99);
		numeros.add(999);
		numeros.add(9999);	
		for (int i = 97; i < 123; i++) { 
		c = (char) i;  
		letras.add(c); 
		} 

		for (int i = 0; i < letras.size(); i++) { 
		System.out.println(letras.get(i) + " " + numeros.get(i)); 
		} 
		System.out.println("Ingrese palabra"); 
		String palabra = entrada.next(); 

		for (int i = 0; i < palabra.length(); i++) { 
		if (letras.contains(palabra.charAt(i))) { 
		System.out.print(numeros.get( letras.indexOf( palabra.charAt( i ) ) )+" " ); 
		} 
		} 
		System.out.println(); 

		} 

	}


