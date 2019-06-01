package Encodage;

import java.util.Arrays;
import java.util.Scanner;

public class Encodage {
	
	//char c = 'g';
	//int code = c;

	public static void main(String[] args) {
		System.out.println("entrez 1 pour unicode et 2 pour cesar:");
		Scanner scanner = new Scanner(System.in);
		int choix1 = scanner.nextInt();
		
		switch(choix1) {
		
		case 1:
		
		System.out.println("entrez 1 pour texte/unicode et 2 pour unicode/texte:");
		Scanner scan = new Scanner(System.in);
		int choix = scan.nextInt();
		
		if(choix == 1) {
		System.out.println("Entrer un mot");
		String mot = "";
		Scanner scane = new Scanner(System.in);
		mot = scane.nextLine();
		char [] message = mot.toCharArray();
				
		//char code = 99;
		for(char lettreMot : message) {
			char messag = lettreMot ;
			int c = (int)messag;
			System.out.print(c + " ");
		}
		}
	
		else if(choix == 2){
			System.out.println("Entrer un mot");
			String mot2 = "";
			Scanner sca = new Scanner(System.in);
			mot2 = sca.nextLine();
	
			 int[] mess = Arrays.stream(mot2).mapToInt(Integer::parseInt).toArray();
		
			//char code = 99;
			for(int lettreMo : mess) {
				int messa = lettreMo ;
				char c = (char)messa;
				System.out.print(c + " ");
			}
			
		}
		case 2:
			
			System.out.println("Entrer un mot");
			String mot = "";
			Scanner scane = new Scanner(System.in);
			mot = scane.nextLine();
			char [] message = mot.toCharArray();
					
			//char code = 99;
			
			for(char lettreMot : message) {
				if(lettreMot == ' ') {
					System.out.println(lettreMot);
				}
				else {
				char messag = lettreMot ;
				int c = (int)messag;
				c+=3;
				int l = c;
				char y = (char)l;
				System.out.print(y);
				}
		
		}
		
	}
	
			
		}
		

	}


