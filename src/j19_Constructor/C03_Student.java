package j19_Constructor;

public class C03_Student {
    String ad;
    String soyad;
    Integer sinif;
    Double ortalama;
    Integer okulNo;
    Boolean takdirBelgesi;
    public C03_Student(String ad, String soyad, Integer sinif, Double ortalama, Integer okulNo, Boolean takdirBelgesi) {
        this.ad = ad;
        this.soyad = soyad;
        this.sinif = sinif;
        this.ortalama = ortalama;
        this.okulNo = okulNo;
        this.takdirBelgesi = takdirBelgesi;
    }
    public C03_Student(){
    }
    public String toString(){
        return "Ad: " + ad.toUpperCase() + "," + " Soyad: " + soyad.toUpperCase() + "," + " Sinif: " + sinif + "," + " Ortalama: " + ortalama + "," + " OkulNo: " + okulNo + "," + " TakdirBelgesi: " + takdirBelgesi;
    }
    public static void main(String[] args) {
        /*
        Task-> fields: ad, soyad, sınıf, ortalama, okulNo, takdirBelgesi olan 2 farklı obj ile
        mezuniyet(ortalama 50 üstü ise mezun oldunuz) sosyalFaaliyet methodlarını  print eden code create ediniz.
        */

        C03_Student s1 = new C03_Student();
        s1.ad = "Bahtiyar";
        s1.soyad = "javaHAN";
        s1.okulNo = 1453;
        s1.ortalama = 99.0;
        s1.sinif = 12;
        System.out.println("s1 = " + s1);
        C03_Student s2 = new C03_Student("JavvaNUR","javaSU",11,77.3,571,false);
        System.out.println("s2 = " + s2);
        System.out.println(s1.mezuniyet(s1.ortalama));
        System.out.println(s2.mezuniyet(s2.ortalama));
        s1.sosyalFaaliyet();
        s2.sosyalFaaliyet();
    }
    private String mezuniyet(Double ortl) {
        return ortl > 50 ? "Gectiniz":"Kaldiniz";
    }
    private void sosyalFaaliyet(){
        System.out.println("Agam sizi sadece mangal basinda sosyal goruyoruz :)");
    }
}