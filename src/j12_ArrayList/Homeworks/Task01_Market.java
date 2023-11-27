package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task01_Market {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     */
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> days = new ArrayList<>(Arrays.asList("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"));
    static ArrayList<Double> dailyearnings = new ArrayList<>();
    public static void main(String[] args) {
        int day = 0;
        while (day < days.size()){
            System.out.print("Please enter "+days.get(day)+"'s earning: ");
            double earning = scanner.nextDouble();
            dailyearnings.add(earning);
            day++;
        }
        System.out.println("Average earnings of the week: "+averageearnings(dailyearnings));
        System.out.println("Days with above-average earnings: "+aboveaverageearningdays(days,dailyearnings));
        System.out.print("Days with below-average earnings: "+belowaverageearningdays(days,dailyearnings));

    }
    private static double averageearnings(ArrayList<Double> dailyearnings){
        double total = 0.0;
        for (double i:dailyearnings){
            total += i;
        }
        return total/dailyearnings.size();
    }
    private static ArrayList<String> aboveaverageearningdays(ArrayList<String> days, ArrayList<Double> dailyearnings) {
        ArrayList<String> aboveaveragedays = new ArrayList<>();
        for (int i = 0; i < dailyearnings.size(); i++) {
            if (dailyearnings.get(i) > averageearnings(dailyearnings)) {
                aboveaveragedays.add(days.get(i));
            }
        }
        return aboveaveragedays;
    }

    private static ArrayList<String> belowaverageearningdays(ArrayList<String> days, ArrayList<Double> dailyearnings) {
        ArrayList<String> belowaveragedays = new ArrayList<>();
        for (int i = 0; i < dailyearnings.size(); i++) {
            if (dailyearnings.get(i) < averageearnings(dailyearnings)) {
                belowaveragedays.add(days.get(i));
            }
        }
        return belowaveragedays;
    }
}