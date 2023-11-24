package j20_StaticKeyword;

public class C03_StaticKeyword {
    int ogrenciID;
    static int ogrenciSayisi;

    public C03_StaticKeyword() {
        ogrenciSayisi++;
        ogrenciID = 101;
    }
    public static void main(String[] args) {
        System.out.println("a obj oncesi ogrenci sayisi: "+ogrenciSayisi);

        C03_StaticKeyword a = new C03_StaticKeyword();

        System.out.println("a obj sonrasi ogrenci sayisi: "+ogrenciSayisi);
        System.out.println("a obj sonrasi ogrenci sayisi: "+ogrenciSayisi);

        C03_StaticKeyword b = new C03_StaticKeyword();
        C03_StaticKeyword c = new C03_StaticKeyword();
        C03_StaticKeyword d = new C03_StaticKeyword();

        System.out.println("a,b,c,d obj sonrasi ogrenci sayisi: "+ogrenciSayisi);

        C03_StaticKeyword e;

        System.out.println("e obj sonrasi ogrenci sayisi: "+ogrenciSayisi);
        System.out.println(a.ogrenciID);
        System.out.println(b.ogrenciID);
        System.out.println(c.ogrenciID);
        System.out.println(d.ogrenciID);
        System.out.println("Gunun sonunda ogrenci sayisi: "+ogrenciSayisi);
    }
}