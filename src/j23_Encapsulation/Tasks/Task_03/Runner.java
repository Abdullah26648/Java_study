package j23_Encapsulation.Tasks.Task_03;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {
        Employees employee = new Employees("Fernando", 80000, "11/23/2000");
        System.out.println("Today: "+LocalDate.now());

        int employeeAge = employee.ageCalculator();

        if (employeeAge > 18) {
            System.out.println("Welcome to our company " + employee.getName() + " your salary is " + employee.getSalary() + "$.");
        } else if (employeeAge < 18) {
            System.out.println("Come back when you are 18 years old.");
        } else {
            System.out.println("We can have an interview with you after that you can have $" + employee.getSalary() + " salary.");
        }
    }
}