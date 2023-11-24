package j20_StaticKeyword;

public class C01_OgretmenRunner {
    public static void main(String[] args) {
C01_Ogretmen t1 = new C01_Ogretmen("Feride",11);
        System.out.println(t1.isim);
        System.out.println(t1.tecrube);
        t1.evliliktebriket();
        t1.maashesapla();
        C01_Ogretmen.maashesapla();
        System.out.println(C01_Ogretmen.okul);
        C01_Ogretmen.okul = "Kabatas";
        System.out.println(C01_Ogretmen.okul);
        System.out.println(t1.okul);
        C01_Ogretmen t2 = new C01_Ogretmen("Sennur",9);
        System.out.println(t2.isim);
        System.out.println(t2.tecrube);
        System.out.println(t2.okul);
    }
}