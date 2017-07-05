package io.altar.exemplos.test;

import java.util.Scanner;

public class Exame {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int stairsUp = s.nextLine();
		int stairsDown = s.nextLine();
		int totalStairs = s.nextLine();
		
		totalStairs = stairsUp + stairsDown;
		
		int numDays = 0;
		
		if ( totalStairs >= stairsUp){
		    numDays = 1;
		}
		
		System.out.println(numDays);
	}
}
