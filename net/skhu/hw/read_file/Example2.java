package net.skhu.hw.read_file;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//���� #2. WordInfo Ŭ������ ArrayList<WordInfo>Ŭ������ �̿��ؼ� �ܾ����� �����϶�.
//       �ܾ� ��Ͽ��� �ܾ ã�� �۾��� ���� Ž������ �����϶�.
class WordInfo {
	String word;
	int count;

	public WordInfo(String word) {
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
		if ((obj instanceof WordInfo) == false)
			return false;
		WordInfo wi = (WordInfo) obj;
		return (this.word == null ? wi.word == null : this.word.equals(wi.word));
	}

	@Override
	public String toString() {
		return word + " : " + count;
	}

}

public class Example2 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(Paths.get("shakespeare.txt"));
		scanner.useDelimiter("[^a-zA-Z]+");
		ArrayList<WordInfo> a = new ArrayList<WordInfo>();
		WordInfo tmp, contain = null;
		boolean include = false;
		boolean none = false;

		while (scanner.hasNext()) {
			String word = scanner.next().toLowerCase();
			tmp = new WordInfo(word);
			if (a.isEmpty())
				a.add(tmp);
			else {
				for (WordInfo w : a) {
					if (w.word.equals(tmp.word)) {
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

		Collections.sort(a, new Comparator<WordInfo>() {
			@Override
			public int compare(WordInfo a, WordInfo b) {
				return b.count - a.count;
			}
		});

		System.out.println("�� �ܾ� �� : " + a.size());
		for (int i = 0; i < 10; i++)
			System.out.println(a.get(i));

		scanner.close();
	}
}
