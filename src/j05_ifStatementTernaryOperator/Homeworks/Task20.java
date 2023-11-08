package j05_ifStatementTernaryOperator.Homeworks;

import java.util.Scanner;

public class Task20 {

    public static void main(String[] args) {
        /*
        etkinlik öneren program
        Koşullar :
        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sıcaklık giriniz (sadece sayi degerini): ");
        int score = scanner.nextInt();
        if (score < 5) {
            System.out.println("Kayak yapmaya git");
        } else if(score>=5 && score<15){
            System.out.println("Sinema'ya git");
        } else if(score>=15 && score<25){
            System.out.println("Piknik yapmaya git");
        } else{
            System.out.println("Yüzme'ye git");
        }
    }
}