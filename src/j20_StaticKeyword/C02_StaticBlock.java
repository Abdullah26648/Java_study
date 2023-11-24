package j20_StaticKeyword;

public class C02_StaticBlock {
    static String isim = "javvaNUR";

    /*
    1.static blok yapıları static variable'rı değer ataması update için kullanılır
    2.static blok Class oluşturulduğunda butun method'lardan(main method dahil) önce çalışır
    3.birden fazla static blok varsa yukarıdan aşagiya sıralama ile çalışır.
    4.static bloklar sadece 1 kere en basta calisir static olmayan bloklar her obje olusturulurken yeniden calisir
    */
    static {
        System.out.println("   ***   1. Static Block Run Edildi   ***   ");
        System.out.println("Static (Update oncesi): "+isim);
        isim = "javaTAR";
        System.out.println("Static (Update sonrasi): "+isim);


    }

    public static void main(String[] args) {
        System.out.println("   ***   Main Block Run Edildi (Start)   ***   ");
        System.out.println("Static (Update oncesi): "+isim);
        isim = "javaMAIN";
        System.out.println("Static (Update sonrasi): "+isim);
        System.out.println("   ***   Main Block Run Edildi (End)   ***   ");
    }
    static {
        System.out.println("   ***   2. Static Block Run Edildi (Start)   ***   ");
        System.out.println("Static (Update oncesi): "+isim);
        isim = "javaHAN";
        System.out.println("Static (Update sonrasi): "+isim);
        System.out.println("   ***   2. Static Block Run Edildi (End)   ***   ");
    }
}