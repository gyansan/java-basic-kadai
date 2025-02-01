package kadai_015;

public class Car_Chapter15 {
	
//	フィールド
	private int gear = 1;
	private int speed = 10;

//速度を変更するメソッド
	public void gearChange(final int afterGear) {
		
		if( gear == afterGear){
			return;
		}
		
		switch(afterGear) {
			case 2 -> speed = 20;
			case 3 -> speed = 30;
			case 4 -> speed = 40;
			case 5 -> speed = 50;
			default -> speed = 10;
		}
		
		System.out.println("ギア" + gear + "から" + "ギア" + afterGear + "に切り替えました");
		
		gear = afterGear;
	}
	
//速度を表示するメソッド
	public void run() {
		System.out.println("速度は時速" + speed + "kmです");
	}

}
