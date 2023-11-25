package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _10_arraylist12 {
    /*
    rangeBtw() isminde bir method oluşturun.
    Parametre olarak   bir Arraylist  ve iki ayrı int
    return tipi int

    Arraylist'in iki int arasında kaç değeri olduğunu sayın.
    return  count       (sayacı (count) döndürün.)

    Example (Örnek):
    ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    min = 20
    max = 30
    return =  5    (20,22,25,28,30)
    min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 5, 22, 10, 20, 14, 8, 25, 30, 28));
        System.out.println("ArrayList: " + arrayList);
        System.out.print("How many are they (btw) ?\nNumber 1: ");
        int a = scanner.nextInt();
        System.out.print("Number 2: ");
        int b = scanner.nextInt();
        System.out.print("They are: "+rangeBtw(arrayList,a,b));
    }
    private static int rangeBtw(ArrayList<Integer> arrayList,int a,int b){
        int counter = 0;
        for (int i : arrayList) {
            if (i>=a & i<=b ){
                counter++;
            }
        }
        return counter;
    }
}