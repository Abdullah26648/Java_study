package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task02_ÖğrtNot {
    public static void main(String[] args) {
          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.
         */
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<Double>();
        System.out.println("Program will store student scores until input 0 !!!");
        while (true) {
            System.out.print("Student score: ");
            Double score = scanner.nextDouble();
            if (score != 0){
                scores.add(score);
            } else {
                break;
            }
        }
        System.out.println("Average score: " + calculateaverage(scores));
        howmanypassed(scores);
    }
    private static double calculateaverage(ArrayList<Double> scores) {
        double total = 0;
        for (double i : scores) {
            total += i;
        }
        return total/scores.size();
    }
    private static void howmanypassed(ArrayList<Double> scores){
        int counter = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (calculateaverage(scores)< scores.get(i)){
                counter++;
            }
        }
        System.out.println(counter+" student scored above average");
    }
}