package j06_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        /*
        TaskATM-> Bakıye 1000$ olan bir banka hesabı için bakıye öğrenme-para çekme-para yatırma
        ve çıkış işlemlerinin yapıldığı bir ATM app. create ediniz
        */
        /*
        TaskATM-> Bakıye 1000$ olan bir banka hesabı için bakıye öğrenme-para çekme-para yatırma
         ve çıkış işlemlerinin yapıldığı bir ATM app. create ediniz.
         */
        Scanner input = new Scanner(System.in);
        int bakıye = 1000;
        System.out.println("   $$$   javaBANK ATM'e Hoş gelmişsen   $$$ ");
        System.out.println("Gakkom ele bi tercihini  gir : \nBAKIYE -> 1\nPARA YATIRMA -> 2\nPARA CEKME -> 3\nCIKIS -> 4");
        int islemTercih = input.nextInt();

        switch (islemTercih) {
            case 1:// Bakıye veren action
                System.out.println("Gakkom hesabında : " + bakıye + " gayme var ....");
                break;
            case 2://Para yatırma action
                System.out.print("Gakkom ne kadar yatırmak isitirsen : ");
                int yatanMiktar = input.nextInt();
                bakıye += yatanMiktar;
                System.out.println("Gakkom para yatırma işlemi başarı ile gerçekleşmiştir  :) ");
                break;
            case 3://Para çekme action
                System.out.print("Gakkom ne kadar çekmek isitirsen : ");
                int çekilenMiktar = input.nextInt();

                if (çekilenMiktar <= bakıye) {// çekilenMiktar bakıyene fazla olam kontrolu
                    bakıye -= çekilenMiktar;
                    System.out.println("Gakkom para çekme işlemi başarı ile gerçekleşmiştir  :) ");
                } else {// yetersiz bakıye şartı
                    System.out.println("Gakkom olmayan para mı çekirsen.Te Ellammm ya :( ");
                }

                break;
            case 4://CIKIS
                System.out.println("Gakkom selametle... yine bekleriz... :) ");
                break;
            default:
                System.out.println("Gakkom ATM'ye ilk defa mı gelirsen adam gibin bişey giresen :( ");
        }


        System.out.println("Gakkom code cincix DEWAMKEEE :)");
    }
}