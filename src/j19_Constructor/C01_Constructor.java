package j19_Constructor;

import j01_Variables.C01_HelloWord;

public class C01_Constructor {//Class level
    /*
    N e D e N  --> OOP <--  k U l L a N ı L ı R...
     Nesne Yönelimli Programlamanın(oop) Faydaları
     1- Obj oluşturma bir Class içerisinde toplanır ve tüm projelerde kullanılabilirliğe imkan sağlar.
     2- Class'ların 1 kez oluşturulması sayesinde uzun kodları tekrardan yazmak yerine kısa kodlamalar ile çalıştırılabilir.
     3- Uzun kodların tekrar yazılmasının engellenmesi sayesinde geliştirme süreci kısalır.
     4- Object'ler birbirinden bağımsız olduğundan data güvenliği konusunda avantaj sağlar.
     5- Class'lar sayesinde tüm projelerde değişiklik yapmak yerine tek bir Class'da değişiklik yapılıp tüm projelerde çalışması sağlanır.
    Bu zaman kaybını büyük ölçüde azaltır.
     */

    // fields-> obj variable => obj değerlerin aldıgı alan özellikler

    /*
    1- consturctor ismi Calss name ile aynı olmalı.Cons. name Buyuk harf ile başlamalı
    2- constructor create edilirkene name den sonra () {} mutlaka kullanılmalı.
    3- eger p'li cons. create edilirse java default cons.(p'siz) ezer(siler)
    4- cons. return type olmaz method'dan ayıran en temel  özelliğidir.
    5- Class tanımlandığında java default(p'siz) cons. kendi create eder.
    6- Fields-> obj'nin uretilirken alacagı değer instance variables
    7- bir class'da bir den çok cons. tanımlanabilir.
     */
    String str;// Class level de obj variable (initial edilmemiş default değer alan) tanımlandı
    String selam = "javaCAN'lara bolcan offer";// Class level de obj variable (initial edilmiş) tanımlandı

    //C01_Constructor obj1 = new C01_Constructor();// Class level de p'siz const ile obj create ediidi
    C01_HelloWord obj99 = new C01_HelloWord();// hariçten bir Class'dan p'siz const ile obj create edildi

    public static void main(String[] args) {//main level
        String maindekiVariable = "mainDen javaTAR'A selam";// main scop'da variable crete edildi

        // ClasIsmi(Data type) objName = new Constructor()  -> new ve Constr :et-Tırnak
        C01_Constructor obj1 = new C01_Constructor();// farklı scop'larda aynı isimde obj creta edilebilir.
        //C01_Constructor obj1 = new C01_Constructor();// aynı scop'da aynı isimde obj creta edilemez
        C01_Constructor obj2 = new C01_Constructor();// faistenilen scop'a istenildiğikadar obj create edilebilir
        C01_Constructor obj3 = new C01_Constructor();// farklı scop'larda aynı isimde obj creta edilebilir.

        obj1.str = "javaNAZZZ";
        obj3.str = "javaHANNN";
        // maindekiVariable// main içindeki varible doğrudan obj olmadan call edilir
        // selam// class leveldak obj variable obj olamdan call edilemez
        obj2.selam = "selamkeee :)";


        System.out.println("obj1.selam = " + obj1.selam);// javaCAN'lara bolcan offer
        System.out.println("obj2.str = " + obj2.str);//null
        System.out.println("obj2.selam = " + obj2.selam);//selamkeee :)
        System.out.println("obj3.str = " + obj3.str);//javaHANNN
        staticMethod();//güneş olan her gezegene erişen meth doğrudan call edildi
        // nonStaticMethod();// nonSttaic meth obj olmadan doğrudan call edilemez
        obj3.nonStaticMethod();// obj ile nonStatic meth call
    }//main sonu

    public  void nonStaticMethod() {// p'siz static olmayan (güneş olmayan-> her gezegene erişemeyen) meth
        System.out.println("Agama  nonStaticMethoddan bolcana selamkeee :)");
    }

    public static void staticMethod() {//p'siz static(Güneş-> her gezegene erişebilir) meth.
        System.out.println("Agama  staticMethoddan bolcana selamkeee :)");

    }

}//Class sonu