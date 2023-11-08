package j08_Loops.Homeworks2;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.
		 */
		int basalangic = 999;
		int sayac = 1;
		while (basalangic>=100) {
			System.out.print(basalangic % 4 == 0 && basalangic % 6 == 0 ? (sayac++)+" = " : "");
			System.out.print(basalangic % 4 == 0 && basalangic % 6 == 0 ? (basalangic == 108 ? basalangic:basalangic+" * ") : "");
			basalangic--;
		}
		System.out.println();// Dummy !!!
		System.out.print("3 basamakli 4 ve 6 ya tam bolunebilen tam sayilarin adedi: "+(sayac-1));
	}
}