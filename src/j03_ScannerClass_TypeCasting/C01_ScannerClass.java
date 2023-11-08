package j03_ScannerClass_TypeCasting;
//Scanner bir Java Class'idir, bu Class'i kullanabilmek icin "import" edilmeli.
//Scanner Class'i Java nin util kutuphanesindedir.

// kullanıcıdan veri almak içinn şu adım takip edilir
//1. adım-> Scanner class'dan obj create edilir.

//  Scanner scan = new Scanner(System.in);// Scanner classından scan isminde değerini System içinden alan bir obj.

//  // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
//  System.out.print("adınızı giriniz :");

import java.util.Scanner;

//  // 3. adım-> kuulanıcının girdigi veri data type'ne göre bir variable atanır.
public class C01_ScannerClass {
    public static void main(String[] args) {
        /*
Task->
Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
1 seker = 1.7 gr
Ornek : Input : cay sayisi : 10 seker sayisi :
        Output : Yilda 12.41 kg seker kullaniyorsunuz
*/
        Scanner scan = new Scanner(System.in);
        System.out.print("cay sayisi : ");
        int cay = scan.nextInt();
        System.out.print("seker sayisi : ");
        int seker = scan.nextInt();
        double yilda = (cay * 1.7 * 365)/1000;
        System.out.println("Yilda " + yilda + " kg seker kullaniyorsunuz");
    }
}
