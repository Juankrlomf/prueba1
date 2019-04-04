package practcasa;

import java.util.Scanner;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*Pedir a un usuario que ingrese números enteros por Consola (ustedes determinan la cantidad)
		 * y solamente guarde en una lista, los números impares
		 */
		
		int a,b,c,d;
		
	    ArrayList<Integer> impares = new ArrayList<Integer>();
	    ArrayList<Integer> pares = new ArrayList<Integer>();
	    
		System.out.println("Ingrese 4 numeros : ");
		Scanner reader = new Scanner(System.in);
		a= reader.nextInt();
		b= reader.nextInt();
		c= reader.nextInt();
		d= reader.nextInt();
		
		
		     if (a % 2 == 0) {
	        	   pares.add(a);
	        } else {
	            impares.add(a);
	        }
		     if (b % 2 == 0) {
	        	   pares.add(b);
	        } else {
	            impares.add(b);
	        }
		     if (c % 2 == 0) {
	        	   pares.add(c);
	        } else {
	            impares.add(c);
	        }
		     if (d % 2 == 0) {
	        	   pares.add(d);
	        } else {
	            impares.add(d);
	        }
	        
		
		System.out.println("los numeros impares son:"+impares);
		
		System.out.println("los numeros pares son:"+pares);
		
	}
}
		
