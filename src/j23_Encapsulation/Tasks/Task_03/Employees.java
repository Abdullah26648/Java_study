package j23_Encapsulation.Tasks.Task_03;

import java.time.LocalDate;

class Employees {
    private String name;
    private int salary;
    private String dob;

    public Employees(String name, int salary, String dob) {
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDob() {
        return dob;
    }

    public int ageCalculator() {
        String[] dobArray = dob.split("/");
        int birthYear = Integer.parseInt(dobArray[2]);
        int currentYear = LocalDate.now().getYear();
        return currentYear - birthYear;
    }
}