package j04_AritmeticOperators;

public class C01_AritmetikOperators {
    public static void main(String[] args) {
        int a = 13;
        int b = 17;
        int c = 47;
        System.out.println(a + b * c);//812
        System.out.println(b + a * c);//628
        /*
		 Islem Onceligi:
		  1)üs ve Parantez ici islemler
		  2)Carpma ve bolmeler
		  3)Toplama ve cikarmalar
		 */
        System.out.println("c/a = " + c / a);// 3

        System.out.println("b+(c-2*a)/2 = " + (b + (c - 2 * a) / 2));// 27
        System.out.println("(c-a/(b-c)+a*b) = " + ((c - a / (b - c) + a * b)));//268

        int d = 12;
        double e = 4;
        float f = 4f;

        System.out.println("d/e = " + (d / e));//3.0
        System.out.println("d+e = " + (d + e));//16.0
        System.out.println("e/d = " + (e / d));//0.3333333333333333
        System.out.println("f/d = " + (f / d));//0.333333334
        // farklı data type aritmetic işlemlerinde sonuç çıktısı buyuk data type olarak verilir.

        //modolus işlemi iki sayının bolumunden KALANI int olarak verir
        // cift sayı(even): 2'ye bolumunden kalan 0 olan-> sayı%2==0
        // tek sayı(odd): 2'ye bolumunden kalan 1 olan-> sayı%2==1
        System.out.println("1453%2 = " + 1453 % 2);//1-> tek

        int g = 2;
        int h = 3;
        String s = "javaCAN";
        //Task -> g h s variable  kullanarak 61javaCAN-1 print eden code create ediniz.
        System.out.println("" + (g * h) + (h - g) + s + (g - h));//61javaCAN-1


    }
}