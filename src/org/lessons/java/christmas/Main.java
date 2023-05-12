package org.lessons.java.christmas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Map<Integer, String> wishList = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		boolean isGo = true;
		Integer count = 0;
		while(isGo) {
			System.out.println("per aggiungere qualcosa alla tua wish list digita 1 per terminare digita tua");
			int val = sc.nextInt();
			if(val<1 || val>2) {
				System.out.println("l'opzione selezzionata non e valita");
				continue;
				
			}
			if(val == 1) {
				String t = sc.nextLine();
				System.out.println("aggiungi un elemento alla tua whish list");
				String whish =  sc.nextLine();
				wishList.put(count++, whish);
				System.out.println(wishList);
			} else if(val == 2) {
				System.out.println("grazie e ciao");
				isGo = false;
			}
		}
			sc.close();	
		System.out.println("ecco la tua lista desideri: " + wishList);	
	}
}
