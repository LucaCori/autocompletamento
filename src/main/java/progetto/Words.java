package progetto;

import java.util.ArrayList;
import java.util.List;

public class Words {
	
	private static String[] elements = {
			"hello",
			"hi Dave",
			"hi Bob",
			"heritage",
			"happiness",
			"goodbye",
			"cruel",
			"car",
			"war",
			"will",
			"world",
			"wall"
	};
	
	public static List<String> getWords() {
		List<String> words = new ArrayList<>();
		for(int i = 0; i < Words.elements.length; i++) {
			words.add(Words.elements[i]);
		}
        return words;
	}
	
	public static String[] getWordsObjects() {
		return getWords().toArray(new String[0]);
	}
	
}