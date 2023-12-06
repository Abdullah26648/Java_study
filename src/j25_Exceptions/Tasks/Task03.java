package j25_Exceptions.Tasks;

public class Task03 {
    public static void main(String[] args) {
        /*
      int v  - int f  isminde 2 adet parametresi olan 'ortalama' isminde bir method create ediniz.
        int v = vize
        int f = final

        Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
        Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını return edin.
        Diğer durumlarda ise,
        vizenin yüzde 40 ını, finalin yüzde 60 toplayarak ortalama hesplayan pr create ediniz.
        vizeye 120, finale 80 girin.

        Programın çalışmasını sağlayın. (handle edin)
         */
        try {
            int result = ortalama(120, 80);
            System.out.println("Ortalama: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int ortalama(int v, int f) {
        if (v > 100 || f > 100 || v < 0 || f < 0) {
            throw new ArithmeticException("Notlar 0-100 arasında olmalı");
        } else {
            double weightedAverage = 0.4 * v + 0.6 * f;
            return (int) weightedAverage;
        }
    }//main sonu
}//Class sonu