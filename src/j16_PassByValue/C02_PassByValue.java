package j16_PassByValue;

public class C02_PassByValue {
    public static void main(String[] args) {
        //  task -> verilen fiyat için %11 %22 ve %33  indirimli  fiyatı print eden return type METHODlar  create ediniz.
        double fiyat = 100;
        System.out.println(guncelleme11(fiyat));
        System.out.println(guncelleme22(fiyat));
        System.out.println(guncelleme33(fiyat));

        System.out.println(fiyat);
    }

    private static double guncelleme33(double fiyat) {
        return fiyat *= 0.67;
    }

    private static double guncelleme22(double fiyat) {
        return  fiyat *= 0.78;
    }

    private static double guncelleme11(double fiyat) {
        return  fiyat *= 0.89;
    }
}