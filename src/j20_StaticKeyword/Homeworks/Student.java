package j20_StaticKeyword.Homeworks;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int maxCredit;
    private List<Lesson> lessons;

    public Student(String name, int maxCredit) {
        this.name = name;
        this.maxCredit = maxCredit;
        this.lessons = new ArrayList<>();
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }

    public int getTotalCredits() {
        int totalCredits = 0;
        for (Lesson lesson : lessons) {
            totalCredits += lesson.getCredit();
        }
        return totalCredits;
    }

    public void printAvailableCourses() {
        for (Lesson lesson : lessons) {
            if (getTotalCredits() + lesson.getCredit() <= maxCredit) {
                System.out.println("Course: " + lesson.getName() + ", Credits: " + lesson.getCredit());
            }
        }
    }

    public void printUnavailableCourses() {
        for (Lesson lesson : lessons) {
            if (lesson.getCredit() > (maxCredit - getTotalCredits())) {
                System.out.println("Course: " + lesson.getName() + ", Credits: " + lesson.getCredit());
            }
        }
    }
}