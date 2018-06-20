package net.skhu.hw.read_file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//구현 #3. WordInfo 클래스와 ArrayList<WordInfo>클래스를 이용해서 단어목록을 구현하라.
//		  단어 목록에서 단어를 찾는 작업은 이진 탐색으로 구현하라.
class WordInfo2 {
	String word;
	int count;

	public WordInfo2(String word) {
		this.word = word;
		this.count = 1;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void count() {
		this.count++;
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof WordInfo2) == false)
			return false;
		WordInfo2 wi = (WordInfo2) obj;
		return (this.word == null ? wi.word == null : this.word.equals(wi.word));
	}

	@Override
	public String toString() {
		return word + " : " + count;
	}

}

public class Example3 {
	
	static int partition(ArrayList<WordInfo2> a, int start, int end) {
		WordInfo2 value = a.get(end);
		int i = start - 1; 
		for (int j = start; j <=end - 1; ++j)
			if (a.get(j).getCount() > value.getCount())
				Collections.swap(a, ++i, j);
		Collections.swap(a, i + 1, end);
		return i + 1;
	}
	
	static WordInfo2 select(ArrayList<WordInfo2> a, int start, int end, int nth) {
		if(start >=end) return a.get(start);
		int middle = partition(a, start, end);
		int middle_nth = middle - start + 1;
		if (nth == middle_nth) return a.get(middle);  
		if (nth < middle_nth) 
			return select(a, start, middle-1, nth);
		else
			return select(a, middle + 1, end, nth - middle_nth);
	}
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(Paths.get("shakespeare.txt"));
		scanner.useDelimiter("[^a-zA-Z]+");
		ArrayList<WordInfo2> a = new ArrayList<WordInfo2>();
		WordInfo2 tmp, contain = null;
		boolean include = false;
		boolean none = false;

		while (scanner.hasNext()) {
			String word = scanner.next().toLowerCase();
			tmp = new WordInfo2(word);
			if (a.isEmpty())
				a.add(tmp);
			else {
				for (WordInfo2 w : a) {
					if (w.equals(tmp)) {
						contain = w;
						include = true;
						break;
					}
				}
				none = true;
			}

			if(include) contain.count();
			if(none) a.add(tmp);
		}

		System.out.println("총 단어 수 : " + a.size());
		for (int i = 1; i <= 10; i++)
			System.out.println(select(a, 0, a.size()-1, i));

		scanner.close();
	}
}
