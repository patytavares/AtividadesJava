package Anayr;

import java.util.Scanner;

//Faça um programa que receba três inteiros e diga qual deles é o maior.
public class Lista2exercicio1 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n entre com o primeiro numero");
	    a=leia.nextInt();
	    
	    System.out.println("\n entre com o segundo numero");
	    b=leia.nextInt();
	    
	    System.out.println("\n entre com o terceiro numero");
	    c=leia.nextInt();
	    
	    if(a>=b && a>=c) { 
	      System.out.println("\n o seu numero maior é : " + a );
	      
	    
	    	
	    }
	    else if (b>=c && b>=a) {
	             System.out.println("\n o seu numero maior é : " + b);
	    
	    }
	    
	    else { 
	    	System.out.println("\n seu numero maior é : " + c);
	    	
	    }
	    
	
			
	}
}