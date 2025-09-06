package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountOfChsr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "Viaan Vivek Mokina Nikalje";
		name = name.replaceAll(" ", "").toLowerCase();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		//read each character and store the count in map
		
		for(char ch :name.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		// print the count using map
		
		for(Map.Entry entry: map.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}

	}

}
