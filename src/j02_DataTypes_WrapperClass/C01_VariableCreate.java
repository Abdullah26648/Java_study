package j02_DataTypes_WrapperClass;

public class C01_VariableCreate {
    /*Variable
  bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
  Variable icinde deger saklayan bir container'dir
  bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
 örneğin bir okulun öğrenci sayısı için variable data türü String,boolean,char veya double alınmamalı.
 geriye kalan tamsayı  turlerınden okulun öğrenci sayısını içine alabilecek büyüklükte bir data turu secilir
 *** genelde tam sayılar için int ondalıklı sayılar için double kullınılır..
 */
    public static void main(String[] args) {
        // variable create(degisken olusturmak) icin...
        // 1- Data type(degisken turu) 2-VariableName(degisken ismi) '=' value(degisken degeri) ';'
        //        int                         Abdullah yas            =        30
        //      declaration                                           =        assignment
        // int maas, tecrube, yas ;
        // maas = 100000
        // tecrube = 7
        // yas = 12
        // int maas =100000, tecrube =7, yas =7
        // oncesinde tanimlanan bir variable tekrar tanimlanamaz, compile error verir.

        int yas = 30 ;
        int maas = 100000 ;
        System.out.println(yas);
        System.out.println("yas");
        System.out.println("yas = " + yas);
        System.out.println("Abdullah\'in maasi : "+maas);


    }
}
