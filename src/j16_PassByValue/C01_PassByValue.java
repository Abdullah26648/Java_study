package j16_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        Java Pass By Value bir programlama dilidir.
        Bir  primitive  variable  argument olarak bir methoda call edildiğinde variable
        değil bir copy clone (vesikalık) (pointer)değeri gönderilir.
        */

        // task -> verilen fiyat için %24 artırılmış fiyatı print eden METHOD  create ediniz.

        double fiyat = 100; // double data type primitive variable
        System.out.println("Method call oncesi : "+fiyat); // 100

        fiyatArttir(fiyat); // method call -> fiyatinizin artmis hali : 124

        System.out.println("Method call sonrasi : "+fiyat); // 100
    }
    private static void fiyatArttir(double fiyat) {
        fiyat*=1.24;
        System.out.println("fiyatinizin artmis hali : "+fiyat);
    }
}