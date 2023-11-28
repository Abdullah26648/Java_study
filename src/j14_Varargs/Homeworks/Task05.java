package j14_Varargs.Homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task05 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> classes = new ArrayList<String>(Arrays.asList("matematik", "geometri", "fizik", "kimya", "biyoloji", "edebiyat", "tarih", "cografya"));
    static ArrayList<Integer> classHours = new ArrayList<Integer>(Arrays.asList(4,2,3,3,3,2,2,2));
    public static void main(String[] args) {
        /*
        Bir okuldaki ogrencilerden ders secmesi isteniyor.
        Alınann ders saati sayısının 12'yi gecmemesi isteniyor.
        Buna gore;
        Asagida ders saatleri verilen derslerden istenildiği kadar seçildiğinde
         ders saatleri toplamı 12'yi gecerse "AGAM Limiti astiniz";
        12'yi gecmezse "AGAM gayet başarılı :)" print eden METHOD create ediniz
        Matematik :4 saat
        Geometri : 2 saat
        Fizik : 3 saat
        Kimya : 3 saat
        Biyoloji : 3 saat
        Edebiyat : 2 saat
        Tarih : 2 saat
        Cografya : 2 saat
         */

        System.out.println("Available courses:");
        for (int i = 0; i < classes.size(); i++) {
            System.out.println((i + 1) + ". " + classes.get(i) + " (" + classHours.get(i) + " hours)");
        }

        System.out.print("Choose courses by entering their numbers separated by spaces:");
        String userInput = scanner.nextLine();
        String[] selectedCourses = userInput.split("\\s+");

        int[] selectedHours = new int[selectedCourses.length];

        for (int i = 0; i < selectedCourses.length; i++) {
            int courseIndex = Integer.parseInt(selectedCourses[i]) - 1;
            selectedHours[i] = classHours.get(courseIndex);
        }

        checkCourseHours(selectedHours);
    }

    private static void checkCourseHours(int... hours) {
        int totalHours = Arrays.stream(hours).sum();

        if (totalHours > 12) {
            System.out.println("Oops, you exceeded the limit");
        } else {
            System.out.println("Well done, you are doing great :)");
        }
    }
}