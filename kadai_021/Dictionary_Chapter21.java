package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	HashMap<String,String> EnWordsMap = new HashMap<String,String>();
	
	public Dictionary_Chapter21() {
	
		EnWordsMap.put("apple","りんご");
		EnWordsMap.put("peach","桃");
		EnWordsMap.put("banana","バナナ");
		EnWordsMap.put("lemon","レモン");
		EnWordsMap.put("pear","梨");
		EnWordsMap.put("kiwi","キウィ");
		EnWordsMap.put("strawberry","いちご");
		EnWordsMap.put("grape","ぶどう");
		EnWordsMap.put("muscat","マスカット");
		EnWordsMap.put("cherry","さくらんぼ");
	
	}
	
	public void searchWords(String[] words) {
		
		for(int i = 0; i < words.length; i++) {
			if(EnWordsMap.containsKey(words[i])) {
				System.out.println(words[i] + "の意味は" + EnWordsMap.get(words[i]));
			} else {
				System.out.println(words[i] + "は辞書に存在しません");
			}
		}
		
	}
	
	
}
