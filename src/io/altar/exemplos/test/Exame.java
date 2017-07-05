package io.altar.exemplos.test;

import java.util.Scanner;

// X(steps per day), Y(steps per Night), N(total steps)
// se ele sobe 5 passos por dia, desce 1 a noite, ele chega ao fim das escadas em 2 dias


public class Exame {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int X = s.nextInt();
		int Y = s.nextInt();
		int N = s.nextInt();
		s.close();
		int numDays = 0;
		
		while ( N >= 0){
		    N -= X;
		    if(N > 0){
		    	N += Y;
		    	numDays ++;
		    }
		}
		System.out.println(numDays);
	}
}
