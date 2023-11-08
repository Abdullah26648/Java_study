package j07_StringManipulation;

public class C06_Substring {
    public static void main(String[] args) {
        /* substring()
        Metin icinde, istenilen araliktaki bir parcasina ya da butunune  String olarak ulaşılmak istenebilir..
        substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
        substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
        indexi'e kadar parçayı return eder
        baslangic indexi ==> inclusive/dahil
        bitis indexi ==> exclusive/haric */
        String str = "madem geldin dunyaya otur calis JAVA'ya";
        System.out.println(str.substring(str.length()-10));
        System.out.println(str.substring(0,10));
        System.out.println(str.substring(0,1)+str.substring(str.length()-1));
        System.out.println(str.substring(str.length()-1,str.length()-2)+str.substring(str.length()-2,str.length()-3)+str.substring(str.length()-3,str.length()-4)+str.substring(str.length()-4,str.length()-5));

    }
}
