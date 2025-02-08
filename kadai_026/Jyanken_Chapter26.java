package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	public static String getMyChoice() {
		
		//手の入力
		System.out.println("僕とじゃんけんで勝負だ！");
		System.out.println("次の３つから手を入力してね");
		
		System.out.println("グー：r");
		System.out.println("チョキ：s");
		System.out.println("パー：p");
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		
		//手の判定
		if (input.equals("r") || input.equals("s") || input.equals("p")) {
            return(input);
        } else {
        	System.out.println("入力された文字はじゃんけんにつかえないよ");
        	return getMyChoice(); 
        }
		
	}
	
	
	
	public static String getRandom() {
		
		//手の配列作成
		String[] fruits = {"r", "s", "p"};
		
		//乱数でじゃんけんの手を選ぶ
		int num = (int) (Math.random() * 3);
		
		return(fruits[num]);
	}
	
	public static void playGame(String myHand,String opponentHand) {
		
		//配列作成
		HashMap<String,String> handMap = new HashMap<String,String>();
	
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");
		
		//じゃんけんの手を出力する
		System.out.println("あなたのハンドは" + handMap.get(myHand) + "で");
		System.out.println("僕のハンドは" + handMap.get(opponentHand) + "だ！");
		
		//手の比較をする
		if (myHand.equals(opponentHand)) { //あいこのパターン
			System.out.println("あいこだね");
			return;
		}
		
		switch (myHand) {
			case "r":
				if (opponentHand.equals("s")) {
					System.out.println("あなたの勝ちだ！");
				} else if (opponentHand.equals("p")) {
					System.out.println("僕の勝ちだ！");
				}
				break;
			case "s":
				if (opponentHand.equals("p")) {
					System.out.println("あなたの勝ちだ！");
				} else if (opponentHand.equals("r")) {
					System.out.println("僕の勝ちだ！");
				}
				break;
			case "p":
				if (opponentHand.equals("r")) {
					System.out.println("あなたの勝ちだ！");
				} else if (opponentHand.equals("s")) {
					System.out.println("僕の勝ちだ！");
				}
				break; 
		}
		
		
	}
	
	
	
	

}
