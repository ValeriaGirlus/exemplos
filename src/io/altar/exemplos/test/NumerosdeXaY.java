package io.altar.exemplos.test;

public class NumerosdeXaY {

	/*
	 Desenvolva um programa que imprima os números de x a y, no entanto deverá 
	 imprimir Fizz sempre que os números sejam múltiplos de 3, 
	 Buzz quando múltiplos de 5 e FizzBuzz quando múltiplos de 3 e 5.
	 */
	public static void main(String [] args){
		int x = 0;
		int y = 15;
		
		for(int i=x; i <= y; i++){
			System.out.println(i);
		
			if(i % 3 == 0){
				System.out.println("Fizz");
			}
			if(i % 5 == 0){
				System.out.println("Buzz");
			}
			if(i % 3 == 0 && i % 5 == 0 ){
				System.out.println("FizzBuzz");
			}
		}
	}
}