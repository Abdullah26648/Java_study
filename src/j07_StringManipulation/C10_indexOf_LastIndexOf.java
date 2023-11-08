package j07_StringManipulation;

import java.util.Scanner;

public class C10_indexOf_LastIndexOf {
    public static void main(String[] args) {

        /* indexOf()
        char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
        Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
        contains den farkı indexini verir, contains ise true false
        */

        String str = "madem geldin dünyaya otur çalış JAVA'ya :)";
        System.out.println("str.indexOf(':') = " + str.indexOf(':'));
        System.out.println("str.indexOf('a') = " + str.indexOf('a'));
        System.out.println("str.indexOf(\"JAVA\") = " + str.indexOf("JAVA"));
        System.out.println("str.indexOf(\"javat\") = " + str.indexOf("java"));//Cikan deger -1 ise iceride bulunmadigi anlamina gelir.
        System.out.println("str.indexOf(\"a\",12) = " + str.indexOf("a", 12));

        /* lastIndexOf()
        String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
        indexOf un sondan olan hali fakat index numaraları değişmez.
        lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
        indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir. */

        System.out.println("str.lastIndexOf(\"a\") = " + str.lastIndexOf("a"));
        System.out.println("str.lastIndexOf(\"x\") = " + str.lastIndexOf("x"));//Cikan deger -1 ise iceride bulunmadigi anlamina gelir.

        /* Task-> girilen bir string ifadenin aşağıdaki şartları sağlamasını kontrol eden code create ediniz
        a-) girilen ifade java içermiyor
        b-) girilen ifade 1 adet java içeriyor
        c-) girilen ifade  1'den çok java içeriyor
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = scanner.next();

        if (str1.indexOf("java") == str1.lastIndexOf("java") && str1.lastIndexOf("java") != -1) {
            System.out.println("girilen ifade 1 adet java içeriyor");
        } else if (str1.indexOf("java") == -1) {
            System.out.println("girilen ifade java içermiyor");
        } else {
            System.out.println("girilen ifade  1'den çok java içeriyor");
        }
    }
}