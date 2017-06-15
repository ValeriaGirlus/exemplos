package io.altar.exemplos.test;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class IdadePessoaNoSistemaSolar {

	/*
	 Desenvolver um programa que receba como parâmetro de entrada um valor de idade em 
	 segundos e retorne a idade desta pessoa em todos os planetas do Sistema Solar.
	 */
	
	private static final int  earthYearInSeconds = 365 * 24 * 60 * 60;
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String input = null;
		int a = 0;
		while(true) {
			try{
				System.out.println("Insira a sua idade em segundos");
				input = s.nextLine();
				a = Integer.parseInt(input);
				System.out.println(agecalc(a));
				s.close();
				break;
			}catch(NumberFormatException e){
				System.out.println("Introduza um numero");
			}
		}
	}
	
	public static LinkedHashMap agecalc(int ageInSeconds) {
		LinkedHashMap<String, Float> agePlanets = new LinkedHashMap<>();
		agePlanets.put("Mercury", new Float(0.241));
		agePlanets.put("Venus", new Float(0.615));
		agePlanets.put("Earth", new Float(1.000));
		agePlanets.put("Mars", new Float(1.881));
		agePlanets.put("Jupiter", new Float(11.86));
		agePlanets.put("Saturn", new Float(29.46));
		agePlanets.put("Uranus", new Float(84.81));
		agePlanets.put("Neptune", new Float(164.8));

		
		LinkedHashMap<String, Float> ageInPlanets = new LinkedHashMap<>();
		for(String key : agePlanets.keySet()) {
			ageInPlanets.put(key, (ageInSeconds / agePlanets.get(key)) / earthYearInSeconds);
		}


		return ageInPlanets;
	}
	
}
