package j12_ArrayList.Homeworks;

import java.util.ArrayList;

public class Task16 {

    /*
      Task:

    Create 2D ArrayList which can store String ArrayLists
    Create 3 ArrayLists which are Employees, Employers, Companies
    Store this 3 ArrayList in 2D ArrayList
    String ArrayList'leri depolayabilen 2D ArrayList oluşturun
    Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
    Bu 3 ArrayList'i 2D ArrayList'te saklayın
    */

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Employee1");
        employees.add("Employee2");
        employees.add("Employee3");

        ArrayList<String> employers = new ArrayList<>();
        employers.add("Employer1");
        employers.add("Employer2");
        employers.add("Employer3");

        ArrayList<String> companies = new ArrayList<>();
        companies.add("Company1");
        companies.add("Company2");
        companies.add("Company3");

        ArrayList<ArrayList<String>> mainList = new ArrayList<>();

        mainList.add(employees);
        mainList.add(employers);
        mainList.add(companies);

        for (ArrayList<String> list : mainList) {
            System.out.print(list);
        }
    }
}