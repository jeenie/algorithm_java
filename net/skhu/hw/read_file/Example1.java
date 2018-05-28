package net.skhu.hw.read_file;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\user\\algorithm\\algorithm\\");
		static BufferdeWriter w = null;
		BufferedReader bf = new BufferedReader(new FileReader("shakespeare.txt"));
		Scanner input = new Scanner(Paths.get(filePath));
		Map<String, Integer> map = new HashMap<String, Integer>();
		String filePath = ";
		
		input.useDelimiter("[^a-zA-Z]+"); 

		Map<String, Integer> map = new HashMap<String, Integer>();
		while(input.hasNext("[a-zA-Z]+")) {
			String word = input.next().toLowerCase();
			if(map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else 
				map.put(word, 1);
		}

		for(String key : map.keySet())
			System.out.printf("%s : %d \n", key, map.get(key));
		System.out.println();

		ArrayList<Map.Entry<String, Integer>> a = new ArrayList<Entry<String, Integer>>(map.entrySet());
		Collections.sort(a, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
				return b.getValue().compareTo(a.getValue());
			}
		});
		System.out.println("출현 횟수가 높은 단어 10개\n---------------------------");
		for(int i = map.size(); i > map.size() - 10 ; i--){
			System.out.println(a.get(a.size() - i).getKey()+" "+a.get(a.size() - i).getValue());
		}
		input.close();
	}

}
