package j04_AritmeticOperators.Homeworks;

public class _20_ComparisonOperators_bigger_equal {

    public static void main(String[] args) {

        /*  İki tane float oluşturun. Birinci float 14, ikinci float 17'dir.
        Birinci float'un, ikinci float'dan büyük eşit olduğunu veya  büyük olduğunu yada olmadığını doğrulayın.
        Sonucu yazdırınız.
        Kodu aşağıya yazınız. */

        float x = 14;
        float y = 17;

        System.out.println("x y\'den buyuk veya esit mi ?: " + (x >= y));
        System.out.println("y x\'den buyuk veya esit mi ?: " + (y >= x));
        System.out.println("x y\'den buyuk mu ?: " + (x > y));
        System.out.println("y x\'den buyuk mu ?: " + (y > x));
    }
}
