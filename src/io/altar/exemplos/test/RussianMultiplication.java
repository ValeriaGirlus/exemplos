package io.altar.exemplos.test;

import java.util.Scanner;

public class RussianMultiplication {

	public static void main(String [] args){
		//código que implemente a multiplicaçao de 2 numeros inteiros 
		//utilizando o algoritmo a multiplicaçao russa
		
		Scanner s = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		String input = null;
		
		while(true) {
			try{
				System.out.println("Insira o primeiro numero");
				input = s.nextLine();
				x = Integer.parseInt(input);
				System.out.println("Insira o segundo numero");
				input = s.nextLine();
				y = Integer.parseInt(input);
				
				if(y == 1){
					System.out.println(x);
				}else{
					
				int z = ((2 * x) * (y / 2));
				while(y != 1){
					if((y%2 == 0)){
						z += x;
					}
					break;	
					}
				}
			}catch(NumberFormatException e){
				System.out.println("Introduza um numero");
			}
		}
	}
}			
				
		
		
	


	

