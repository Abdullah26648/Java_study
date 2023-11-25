package j12_ArrayList.Homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class _04_arraylist4 {

    /*
    İsmi changeInArraylist() olan bir method oluşturun.
    Parametre olarak String ArrayList, String s1, String s2
    Arraylist'te s1'i s2 olarak değiştirin

    Return String arrayList

    Örneğin;
    Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
    s1 = blue
    s2 = yellow
    Tüm blue 'ları yellow'a dönüştürün.
    cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
    */
    public static void main(String[] args) {
        String s1 = "blue";
        String s2 = "yellow";
        ArrayList<String> arraylist = new ArrayList<String>(Arrays.asList("yellow" , "red" , "blue" , "red" , "blue"));
        changeInArraylist(arraylist,s1,s2);
        System.out.println(arraylist);
    }
    private static void changeInArraylist(ArrayList<String> arraylist, String s1, String s2) {
        for (int i = 0; i < arraylist.size(); i++){
            if (s1.equals(arraylist.get(i))){
                arraylist.set(i,s2);
            }
        }
    }
}