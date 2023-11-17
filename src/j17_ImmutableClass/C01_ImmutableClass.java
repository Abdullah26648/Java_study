package j17_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        String str1 = "Senur"; // ilk deger (initial) atamasi Sennur value ile yapilmis str1 variable StringPool'da create edildi.
        String str2 = "Senur"; // str1 ve str2 ayni deger ile ilk atamalari yapildigi icin StringPool'da ortak referans degere sahip.
        String str3 = new String("Sennur"); // ilk deger (initial) atamasi Sennur value ile yapilmis stDr3 obj(heap memory -> unique ref) create edildi
        String str4 = new String("Sennur"); // ilk deger (initial) atamasi Sennur value ile yapilmis stDr4 obj(heap memory -> unique ref) create edildi

        String str5 = str1 + ""; // str1 ve str2 ref degerleri esit ama str5 ref degerleri farkli
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1.equals(str2));
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        System.out.println(str1 == str5);
        System.out.println(str1.equals(str5));
    }
}