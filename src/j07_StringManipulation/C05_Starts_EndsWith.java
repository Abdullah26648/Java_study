package j07_StringManipulation;

public class C05_Starts_EndsWith {
    public static void main(String[] args) {
        /*
        startsWith()
        Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
        String'in basladigi characteri dogrular
        endsWith()
        Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */
        String str1="ebikGabık";
        System.out.println("str1 = " + str1);

        // str1.startsWith('e');// parametre char ->CTE
        System.out.println("str1.startsWith(\"e\") = " + str1.startsWith("e"));// true
        String str2="ebik";
        System.out.println("str1.startsWith(str2) = " + str1.startsWith(str2));// true
        System.out.println("str2.startsWith(str1) = " + str2.startsWith(str1));// false
        System.out.println("str2.startsWith(str2) = " + str2.startsWith(str2));// true

        System.out.println("str2.endsWith(str2) = " + str2.endsWith(str2));// true
        System.out.println("str2.endsWith(str1) = " + str2.endsWith(str1));// false
        //Task-> girilen e-mail hesabının  @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        // @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz print edn code creae ediniz.
    }
}