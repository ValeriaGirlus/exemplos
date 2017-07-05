package io.altar.exemplos.test;

import java.util.Scanner;

public class Palíndromo {

  // Desenvolva um método que identifique se uma String é um palíndromo ou não.

	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String input = null;
		String a = "";
		s.close();
		
		while(true) {
			try{
				System.out.println("Introduza a sequência de caracteres");
				input = s.nextLine();
				break;
			}
			catch(Exception e){
				System.out.println("Introduza letras e/ou números ");
			}
		}
		
		System.out.println(invertText(a));
	}
	
	public static String invertText(String a){
		String b = "";                                                    
	
		for(int i=a.length()-1; i>=0; i--){
			
			b += a.charAt(i);
		}		
		if(a.equals(b)){
			System.out.println("A sequência de caracteres introduzida é um palíndromo :)");
		}else{
			System.out.println("Experimente outra vez");
		}	
		return(b);
	}
}
