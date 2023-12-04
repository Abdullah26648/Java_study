package j23_Encapsulation.Tasks.Task_02;

public class StudentRunner {
    public static void main(String[] args) {
        Student s1=new Student();

        s1.setName("Haluk");
        System.out.println("Student name is "+s1.getName());

        s1.setAge(48);
        System.out.println("He is "+s1.getAge()+" years old");

    }
}