package j10_MethodCreation.Homeworks;

import java.util.Scanner;

public class Task14 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        /* task->
        Fazla mesaiyi hesaplayan ve toplam kazancı return eden method create ediniz


        Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
        fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

        Örnek :
        saatlik çalışma ücreti : 40.0
        iş başı saati : 9.0
        paydos saati : 20.0
        fazla mesaiyi saat ücreti çarpanı: 1.8

        ucretHesapla(9.0,20.0,40.0,1.8);

        9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
        17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

        toplam = 536.0
        */
        System.out.print("What is your hourly working wage?: ");
        double hourlyWage = scanner.nextDouble();
        System.out.print("What is the start time of your workday (e.g., 9.0 for 9:00 AM)?: ");
        double startTime = scanner.nextDouble();
        System.out.print("What is the end time of your workday (e.g., 17.0 for 5:00 PM)?: ");
        double endTime = scanner.nextDouble();
        System.out.print("What is your overtime wage rate?: ");
        double overtimeRate = scanner.nextDouble();

        double totalEarnings = paycalculate(startTime, endTime, hourlyWage, overtimeRate);
        System.out.println("Total Earnings: " + totalEarnings);
    }//main sonu
    public static double paycalculate(double startHour, double endHour, double hourlyWage, double overtimeRate) {
        double regularHours = Math.min(8.0, endHour - startHour); // Assuming regular working hours are 8 per day
        double overtimeHours = Math.max(0, endHour - 8.0 - startHour);

        double totalEarnings = (regularHours * hourlyWage) + (overtimeHours * (overtimeRate*hourlyWage));

        return totalEarnings;
    }
}//class sonu