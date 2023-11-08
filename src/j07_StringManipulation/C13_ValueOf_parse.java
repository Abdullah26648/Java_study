package j07_StringManipulation;

public class C13_ValueOf_parse {
    public static void main(String[] args) {
        /*
        Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        Stringlerle matematiksel islemler yapabilmemizi saglar.

        valueOf(); meth hem Integer wrapper  hem de String Class'da bulunur. Integer wrapper Class
        valueOf() methdou String'i integer'a  String Class valueOf() methodu integer'i String'e cevirir.
        */

        // task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..
        String b1= "10000";
        String b2= "12000";
        System.out.println("b1+b2 = " + b1 + b2);
        int yenib1 = Integer.valueOf(b1);
        int yenib2 = Integer.valueOf(b2);
        System.out.println("(yenib1+yenib2) = " + (yenib1 + yenib2));
        /*
        Task-> String strA="$13.99"  String strB="$17.55" parse method kullanarak strA+strB toplamını print den code create ediniz
        output: strA+strB=31.54
        */
        String strA="$13.99";
        System.out.println("strA = " + strA);
        String strB="$17.55";
        System.out.println("strB = " + strB);
        String strAyeni = strA.replace("$","");
        System.out.println("strAyeni = " + strAyeni);
        String strByeni = strB.replace("$","");
        System.out.println("strByeni = " + strByeni);
        Double intA = Double.valueOf(strAyeni);
        System.out.println(intA);
        Double intB =Double.valueOf(strByeni);
        System.out.println(intB);
        System.out.println("TOPLAM= "+(intA + intB));
        /*
        Integer.valueOf() ile Integer.parseInt() metotları arasında temel fark
        valueOf() metodu Integer tipinde bir obj, parseInt() metodu ise int tipinde bir veri tipi döndürür.
        parseInt() metodu primitive veri tipi döndürdüğü için daha hızlı çalışır.
        */

    }
}