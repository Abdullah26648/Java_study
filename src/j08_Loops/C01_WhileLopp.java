package j08_Loops;

import java.util.Scanner;

public class C01_WhileLopp {
    public static void main(String[] args) {
        /*
        Başlangıç bitiş ve değişim değerleri net  bilinen tekrarlarda for loop ama adım sayısı değişim değeri
        net bilinmeyen belli bir şarta(durum-boolean) bağlı olan tekrarlara while loop kullanılır.
        */
        // Task01-> 3'den 20'ye kadar olan tamsayıları print eden code create ediniz.

        for (int i = 3 ; i <= 20 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Dummy !!!
        int basla = 3;
        while (basla<=20){
            System.out.print(basla + " ");
            basla++;
        }
        System.out.println();// Dummy !!!
        // task02-> 7 kere javaCAN print eden code create ediniz
        int basla2 = 7;
        while (basla2>=1){
            System.out.println("javaCAN");
            basla2--;
        }
        System.out.println();// Dummy !!!
        // task03->2 basamaklı tek sayıları print eden code create ediniz
        int basla3 = 11;
        while (basla3<=99){
            System.out.print(basla3 % 2 == 0 ? "" : basla3+" ");
            basla3++;
        }
        System.out.println();// Dummy !!!
        // task04->bir basamaklı sayma sayılarını aynı satırda print eden code create ediniz
        int basla4 = 1;
        while (basla4<10){
            System.out.print(basla4+" ");
            basla4++;
        }
        // task05->girilen ifadeyi tersten print eden code create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tersten yazmak istediginiz bir ifade giriniz: ");
        String line = scanner.nextLine();
        int basla5 = line.length()-1;
        String str0 = "";
        while (basla5>=0){
            str0 += line.charAt(basla5);
            basla5--;
        }
        System.out.print("Girilen ifadenin tersi: "+str0);
        System.out.println();// Dummy !!!
        // task06->girilen tamsayıya kadar sayıların toplamını  print eden code create ediniz
        System.out.print("Bir sayi giresen: ");
        int str1 = scanner.nextInt();
        int toplam = 0;
        while (str1>0){
            toplam += str1;
            str1--;
        }
        System.out.print("Toplaminiz: "+toplam);
        System.out.println();// Dummy !!!
        // task07->girilen tamsayının faktöriyelini  print eden code create ediniz
        System.out.print("Faktoriyelini bulmak istediginiz sayiyi giriniz: ");
        int str2 = scanner.nextInt();
        int carpim = 1;
        while (str2>0){
            carpim *= str2;
            str2--;
        }
        System.out.print("Faktoriyeliniz: "+carpim);
        System.out.println();// Dummy !!!
        //

    }
}