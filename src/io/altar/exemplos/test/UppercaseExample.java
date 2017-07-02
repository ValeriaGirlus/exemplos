package io.altar.exemplos.test;

public class UppercaseExample {

	/*
	 m�todo que recebe como parametro uma string constituida por palavras separadas pelo caracter espa�o,
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


