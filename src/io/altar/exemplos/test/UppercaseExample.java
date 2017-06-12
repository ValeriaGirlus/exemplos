package io.altar.exemplos.test;

public class UppercaseExample {

	/*
	 método que recebe omo parametro uma string constituida por palavras separadas pelo caracter espaço,
	 e que capitalize a primeira letra de todas as palavras 
	 */
	public static void main(String [] args){
		String a = "ola eu sou toto";
		System.out.println(exec2(a));
	}
	
	public static String exec2(String a){
		String b = "";
		
		for(int i=0; i<a.length(); i++){
			if(i==0){
				b = b + Character.toUpperCase(a.charAt(i));
			} else if(a.charAt(i-1) == ' ') {
				b = b + Character.toUpperCase(a.charAt(i));
			}
			else {
				b += a.charAt(i);
			}
		}
		return(b);
	}
}


