package io.altar.exemplos.test;

import java.util.Scanner;

public class FibonnaciExample {

	//calcular os primeiros 50 numeros (pedir input do utilizador) da sequencia de Fibonacci
	//fazer a sua m�dia
	
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		//n � o comprimento da sequencia
		int n = 0;
		String input = null;
		while(true) {
			try{
				System.out.println("Quantos n�meros pretende obter da sequencia?");
				input = s.nextLine();
				n = Integer.parseInt(input);
				break;
			}
			catch(NumberFormatException e){
				System.out.println("Introduza um numero");
			}
			System.out.println(n);
			//ate aqui so tem a ver com o valor que o utilizador pretende obter
			//os numeros que sao obtidos sao mostrados dentro dum array
			int [] numberArray = new int [n];
			int total = 0;
			double average = 0;
			for(int i=0; i<n; i++){
				if(i>1){
					//a partir do 1 faz-se a soma dos 2 anteriores(i-2 com i-1) para dar o actual(i)
					numberArray[i] = numberArray[i-1] + numberArray[i-2];
				}
				else{
					//se o i for 0 ou 1, � retornado 0 ou 1 dentro do array e nao h� soma
					numberArray[i] = i;
				}
				//isto � o mesmo que total=total+numberArray
				total += numberArray[i];
				System.out.println(numberArray[i]);
			}
			average = ((double)total/n);
			//a m�dia aparece como valor decimal(double)
			System.out.println("m�dia" + total + "/" + n + "=" + average);
		}
	}
}

/*
 
 OUTRA SOLU��O
 
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class FibonacciSolution {

	// Please note the limitation of int being only 32-bit
	public static void main(String[] args) {
		int max = 10;
		List<Integer> intList = new ArrayList<>();

		for (int i = 0; i < max; i++) {
			intList.add(fibonacci(i + 1));
		}

		intList.stream().forEach(System.out::println);

		OptionalDouble average = intList.stream().mapToDouble(Integer::doubleValue).average();

		if (average.isPresent()) {
			System.out.printf("Average is %.2f", average.getAsDouble());
		}
	}

	public static int fibonacci(int f) {
		if (f == 1 || f == 2) {
			return 1;
		}

		return fibonacci(f - 1) + fibonacci(f - 2);
	}
}

 */
