package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.
        ArrayList<Integer>sayiList = new ArrayList<>(Arrays.asList(1,3,6,78,94,23,54,4,89,34));
        Scanner input = new Scanner(System.in);
        System.out.print("Agam hangi sayiyi arirsen: ");
        int arananSayi = input.nextInt();
        boolean arananSayivarMi = false;
        for (int i = 0; i < sayiList.size(); i++){
            if (sayiList.get(i) == arananSayi){
                arananSayivarMi = true;
                break;
            }
        }
        System.out.println(arananSayivarMi ? "Aranan sayi List'te mevcut" : "Aranan sayi List'te mevcut degil");
    }
}