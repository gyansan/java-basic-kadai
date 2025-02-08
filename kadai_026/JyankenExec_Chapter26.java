package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		
		Jyanken_Chapter26 janken = new Jyanken_Chapter26();
		
		String myHand = janken.getMyChoice();
		
		String opponentHand = janken.getRandom();
		
		janken.playGame(myHand,opponentHand);
		
	}

}
