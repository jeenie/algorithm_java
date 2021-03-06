package net.skhu.hw.read_file;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

//구현 #1. HashMap클래스를 이용하여 구현하라.
public class Example1 {

	public static void main(String[] args) throws IOException { 
		Scanner scanner = new Scanner(Paths.get("shakespeare.txt")); 
		scanner.useDelimiter("[^a-zA-Z]+"); 

		Map<String, Integer> map = new HashMap<String, Integer>();
		while (scanner.hasNext())
		{
			String word = scanner.next().toLowerCase();
			if (map.containsKey(word))
				map.put(word, map.get(word)+1);
			else
				map.put(word, 1);
		}

		ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<Entry<String,Integer>>(map.entrySet());

		Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
				return b.getValue().compareTo(a.getValue());
			}
		});
		
		Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();

		System.out.println("총 단어 수 : " + map.size());
		for(int i = 0 ; i < 10; i++) {
			Map.Entry<String, Integer> word = iterator.next();
			System.out.println(word.getKey() + " : " + word.getValue());
		}
		
		scanner.close();
	}

}
