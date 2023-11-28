package j23_Encapsulation.Encapsulation02;

public class KisiRunner {
    public static void main(String[] args) {

        Kisi kisi = new Kisi();

        kisi.setAd("Abdullah");
        kisi.setSoyad("Ozdemir");
        //kisi.setPassword("securePassword");
        kisi.setYas(-30);

        System.out.println("Ad: " + kisi.getAd());
        System.out.println("Soyad: " + kisi.getSoyad());
        System.out.println("Password: " + kisi.getPassword());
        System.out.println("Yas: " + kisi.getYas());
    }
}