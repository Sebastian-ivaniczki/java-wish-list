package org.lessons.java.christmas;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
	
public class MainSet {
	public static void main(String[] args) {
		Random rn = new Random();
	    
		Set<Integer> numbers = new HashSet<>();
		
			
			for(int i = 0; i < 20; i++){
				if(numbers.size() < 5) {
					int	randNum = rn.nextInt(2, 13);
					System.out.println(randNum);
					numbers.add(randNum);
				}
			}
	
		System.out.println(numbers);
	    
	}
}
