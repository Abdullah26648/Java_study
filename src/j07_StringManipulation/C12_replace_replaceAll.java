package j07_StringManipulation;

public class C12_replace_replaceAll {
    public static void main(String[] args) {
        /*
         * replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
         * (update -set) saglar. Sonuc String'dir..
         */
        String str = "madem gelding dünyaya otor çalış JAVA'ya :)";
        System.out.println("str = " + str);
        System.out.println("str.replace(\"a\", \"*\") = " + str.replace("a", "*"));
        System.out.println("str = " + str);
        System.out.println("str.replace(\"yaya\", \"$\") = " + str.replace("yaya", "$"));
        System.out.println("str.replace(\"ü\",\"u\") = " + str.replace("ü", "u"));
        System.out.println("str eski = " + str);
        System.out.println("str.replace(\":\", \"\") = " + str.replace(":)", ""));
        System.out.println("str yeni = " + str);
        //(Regular Expressions)
        //   \\s bosluk (
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler
        str= "javaCAN'lara selam bolcana 123456780232 § $ # £ offer :) ";
        System.out.println("str = " + str);
        str.replaceAll("\\s", "*");// Butun space ler * ile degistirir.
        str.replaceAll("\\S", "*");// Butun space disindaki tum karakterleri * ile degistir.
        str.replaceAll("\\w", "*");// Butun harfeleri ve rakamlari * ile degistir.
        str.replaceAll("\\d", "*");// Butun rakamlari * ile degistir.
        str.replaceAll("\\D", "*");// Butun rakam disindaki karakterleri * ile degistir.
    }
}