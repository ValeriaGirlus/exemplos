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
		int z = 0;
	
		while(true) {
			try{
				System.out.println("Insira o primeiro numero");
				input = s.nextLine();
				x = Integer.parseInt(input);
				System.out.println("Insira o segundo numero");
				input = s.nextLine();
				y = Integer.parseInt(input);
				break;
			}catch(NumberFormatException e){
				System.out.println("Introduza um numero");
			}
		}
	
		if(y == 1){
			System.out.println(x);
		}
		if(x == 1){
			System.out.println(y);
		}
		
		//o while só acaba quando y=1
		while(y >= 1){
			//System.out.println(x);
			//se o y for par, o x multiplica por 2 e o y divide por 2, mas o x nao conta para a soma final
			if(y%2 == 0){
				x *= 2;
				y /= 2;
			//se o y for ímpar, acontece o mesmo que em cima mas soma ao x os valores multiplicados do x
			}else{
				z += x;
				x *= 2;
				y /= 2;
				
			}
		}
		System.out.println(z);	
	}
}  
		
	
		
	


	

