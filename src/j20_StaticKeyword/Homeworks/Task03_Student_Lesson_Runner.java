package j20_StaticKeyword.Homeworks;

public class Task03_Student_Lesson_Runner {
    /*
    Task 03 ->
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz

     */

    public static void main(String[] args) {

        Lesson mathLesson = new Lesson("Math", 5);
        Lesson historyLesson = new Lesson("History", 3);
        Lesson biologyLesson = new Lesson("Biology", 7);

        Student student = new Student("John Doe", 10);

        student.addLesson(mathLesson);
        student.addLesson(historyLesson);
        student.addLesson(biologyLesson);

        System.out.println("Courses the student can take:");
        student.printAvailableCourses();

        System.out.println("\nCourses the student cannot take:");
        student.printUnavailableCourses();
    }
}