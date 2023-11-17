package j17_ImmutableClass;

import java.util.ArrayList;

public class C02_MutableClass {
    public static void main(String[] args) {
        /*
        Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
        BigDecimal, BigInteger java'da immutable->değişmez sınıflara örnek olarak gösterilebilir.
        StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.
        */
        String name = "Seckin";
        System.out.println("   *** Immutable Class ***   ");
        System.out.println("Meth call oncesi name: " + name);
        name.concat(" askin olayim :-) ");
        System.out.println("Meth call oncesi name: " + name);

        System.out.println("   *** Mutable Class ***   ");
        ArrayList<String> isimList = new ArrayList<String>();
        System.out.println("Meth call oncesi isimList: " + isimList);
        isimList.add("Can");
        isimList.add("Icardi");
        isimList.add("Muslera");
        System.out.println("Meth call sonrasi isimList: " + isimList);

    }
}