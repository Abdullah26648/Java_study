package j05_ifStatementTernaryOperator.Homeworks;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        /*
        TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
        Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
        aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcınin ehliyeti var mi?: ");
        char ehliyet = input.next().charAt(0);
        System.out.println("Kullanıcı kac yillik sofor: ");
        int yil = input.nextInt();
        System.out.println("Kullanıcınin kac km yol yapmis?: ");
        int km = input.nextInt();

        if (ehliyet == 'E') {
            if (yil >= 7) {
                if (km >= 100000) {
                    System.out.println("Buyur anahtarin agam");
                } else {
                    if (yil >= 7){
                        System.out.println("Daha " + (100000 - km) + " km yol yapman lazim.");
                    }else{
                        System.out.println("Daha " + (100000 - km) + " km yol yapman lazim.");
                        System.out.println("Daha " + (7 - yil) + " yıl tecruben eksik.");
                    }
                }
            } else {
                if (km >= 100000) {
                    System.out.println("Daha " + (7 - yil) + " yıl tecruben eksik.");
                } else {
                    System.out.println("Daha " + (100000 - km) + " km yol yapman lazim.");
                    System.out.println("Daha " + (7 - yil) + " yıl tecruben eksik.");
                }
            }
        } else if (ehliyet == 'H'){
            System.out.println("Agam ehliyetsiz trafige mi cikilir?");

        }
    }
}