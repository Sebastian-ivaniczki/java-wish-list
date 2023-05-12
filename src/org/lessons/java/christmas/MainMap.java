package org.lessons.java.christmas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainMap {
	public static void main(String[] args) {
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";

		//System.out.println(Arrays.asList(str.split(" ")));
		
		Map<String, Integer> wordCaunt = new HashMap<>();
		String[] str1 = str.split(" ");
		
		
		for(String word : str1) {
			//System.out.println(word);
			word = word.replaceAll("\\p{Punct}", "");
			if(!word.isEmpty()) {
				
				
				word.toLowerCase();
				Integer count = wordCaunt.getOrDefault(word, 0);
				wordCaunt.put(word, count + 1);
			}
		}
		
		System.out.println(wordCaunt);
	}
}
