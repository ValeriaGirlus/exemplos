package io.altar.exemplos.test;

import java.util.Locale;
import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;



public class DomingosEmFesta {

	/*
   A empresa Domingos em Festa organiza festas de aniversário, no entanto o seu 
   proprietário apenas tem disponibilidade aos domingos. Para o auxiliar na sua operação,
   necessita de um programa que ao introduzir uma data este lhe diga qual o dia da semana e, 
   caso este não seja um domingo, lhe indique qual a data do próximo domingo.
 */
	
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String input = "";
		
		while(true){
			try {
				System.out.println("Insira a data que pretende para a festa");
				input = s.nextLine();
			    DateTimeFormatter formatter =
			                      DateTimeFormatter.ofPattern("yyyy-MM-dd");
			    LocalDate date = LocalDate.parse(input, formatter);
			    System.out.printf("%s%n", date);
			    s.close();
			    //break;
			}
			catch (DateTimeParseException exc) {
			    System.out.printf("A data que introduziu não tem o formato correcto. Introduza a data no formato yyyy-MM-dd");
			    
			}
		LocalDate data = LocalDate.now(); 
		System.out.println("A data que introduziu corresponde a " + data.getDayOfWeek().getDisplayName(TextStyle.FULL ,new Locale("pt", "PT")));
		
		
		
		}	
	}
}