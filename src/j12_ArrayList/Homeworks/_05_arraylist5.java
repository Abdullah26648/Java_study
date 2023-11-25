package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class _05_arraylist5 {
    /*
    rotateList() isminde bir method oluşturun.
    Parametre olarak String ArrayList
    ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
    Tersten yazılmış halini return edin.
    Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
    cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
    */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));
        ArrayList<String> reversedList = rotateList(arrayList);
        System.out.println(reversedList);
    }
    private static ArrayList<String> rotateList(ArrayList<String> arrayList) {
        ArrayList<String> reversedList = new ArrayList<>();
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            reversedList.add(arrayList.get(i));
        }
        return reversedList;
    }
}