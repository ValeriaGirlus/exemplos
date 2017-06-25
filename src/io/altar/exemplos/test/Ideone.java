package io.altar.exemplos.test;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Ideone {
	
	public static void main (String[] args) throws java.lang.Exception 
	{
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();		
		LinkedHashMap<Character, Integer> characterNumber = new LinkedHashMap <>();
		for(int i = 0, n = input.length(); i < n; i++ ){
			if(characterNumber.containsKey(input.charAt(i))){
				characterNumber.put(input.charAt(i), characterNumber.get(input.charAt(i)) + 1 );
			}else{
				characterNumber.put(input.charAt(i), 1);	
			}
		}
		String tempString = "";
		for(Character k : characterNumber.keySet()) {
			for(int n = 0; n < characterNumber.get(k); n++){
				tempString+=k;
			}
		}
		if(characterNumber.size() == 3 && tempString.equals(input)){
			System.out.println("Like");
		}else {
			System.out.println("Unlike");
		}	
	}
}	
