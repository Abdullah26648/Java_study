package j04_AritmeticOperators;

public class InterviewQuestions {
    public static void main(String[] args) {
        /*
        TASK :
        Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
        a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan

        input   : sayi1=20 ve sayi2=34;
        output  :  sayi1=34 ve sayi2=20
        */

        // Cozum 1:
        System.out.println("Cozum 2");
        int sayi1=20;
        int sayi2=34;
        System.out.println("Sayi 1: " + sayi1);
        System.out.println("Sayi 2: " + sayi2);

        int sayi3=sayi1;
        sayi1=sayi2;
        sayi2=sayi3;
        System.out.println("Islem sonrasi:");
        System.out.println("Sayi 1: " + sayi1);
        System.out.println("Sayi 2: " +sayi2);

        // Cozum 2:
        System.out.println("Cozum 2");
        sayi1=20;
        sayi2=34;
        System.out.println("Sayi 1: " + sayi1);
        System.out.println("Sayi 2: " + sayi2);

        //sayi1 = sayi1 + sayi2;//sayı1=54
        sayi1 += sayi2;//sayı1=54
        sayi2 = sayi1 - sayi2;// sayı2=20-> sayı1(54)-sayı2(34)
        sayi1 = sayi1 - sayi2;// sayı=34 -> sayı1(54)-sayı2(20)
        System.out.println("Islem sonrasi:");
        System.out.println("Swap sonrası sayı1 -> " + sayi1 + " sayı2 -> " + sayi2);//Swap öncesi sayı1 -> 34 sayı2 -> 20
    }
}
