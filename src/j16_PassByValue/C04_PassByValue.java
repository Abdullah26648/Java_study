package j16_PassByValue;

public class C04_PassByValue {
    static double etiketFiyati;
    static double indirimOrani;
    public static void main(String[] args) {
        /*
        eger bir method'a yapılan değişiklik kalıcı olsun istenirse
        1.değişklik  yapılan variable'lar static (gökteki güneş) olarak tanımlanır.
        */

        etiketFiyati = 100;
        indirimOrani = 0.1;
        System.out.println("Indirim oncesi fiyat: "+etiketFiyati);
        indirim();
        System.out.println("Indirim sonrasi fiyat: "+etiketFiyati);
    }

    private static void indirim() {
        etiketFiyati *= (1-indirimOrani);
        System.out.println("Indirilmis fiyat: "+etiketFiyati);
    }
}