package j09_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {
        // Task -> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        String pin = "javvaNUR";
        int count = 3;
        while (true) {
            System.out.print("Agam sifreni giresen: ");
            String sifre = scanner.nextLine();
            if (sifre.equals(pin)){
                System.out.print("Giris hakki kazandin");
                break;
            }
            count --;
            System.out.print("Agam " + count + " kadar hakkin kaldi !!!");
            if (count == 0 ) {
                System.out.print("Giris hakki kalmadi");
                break;
            }
        }
    }
}