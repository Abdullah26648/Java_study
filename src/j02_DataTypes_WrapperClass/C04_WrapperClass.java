package j02_DataTypes_WrapperClass;
/*
           Note: Java primitive lere method'lar ekleyerek yeni bir
                 yapi olusturdu, bu yapiya "Wrapper Class"
                 Primitive         Wrapper
                    byte     ==>    Byte
                    short    ==>    Short
                    ** int   ==>    Integer
                    long     ==>    Long
                    float    ==>    Float
                    double   ==>    Double
                    boolean  ==>    Boolean
                    ** char  ==>    Character
        */
public class C04_WrapperClass {
    public static void main(String[] args) {
        String str="JavaCAN";
        int yas=48;
        double pi=3.14;
        // System.out.println(yas.getClass());// CTE -> yas primitive oldg için class'ı yoktur
        // System.out.println(pi.getClass());// CTE -> pi primitive oldg için class'ı yoktur.
        /*
        Integer.valueOf(yas) veya Double.valueOf(pi) ifadeleri kullanılarak ilkel veri tipleri
        Wrapper class'a dönüştürülerek Class meth kullanılabilir
        */
        System.out.println(str.getClass());
        //  System.out.println(yas.getClass());
        //  System.out.println(pi.getClass());
        String isim="Mustafa";
        System.out.println(isim);
        System.out.println(isim.toUpperCase());
        /*
        non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        ancak primitive data turlerinin boyle bir ozelligi yoktur
        primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
        Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        ara çözüm imkanı sunmuştur.
        */
        String id = "1453";
        String tc = "1234567";
        System.out.println(id+tc);
        Integer yeniID = Integer.valueOf(id);
        Integer yeniTC = Integer.valueOf(tc);
        System.out.println(yeniTC+yeniID);
        Byte bmax=Byte.MAX_VALUE;
        Short smax=Short.MAX_VALUE;
        Integer imax=Integer.MAX_VALUE;
        Byte bmin=Byte.MIN_VALUE;
        Short smin=Short.MIN_VALUE;
        Integer imin=Integer.MIN_VALUE;
        System.out.println(bmax);
        System.out.println(smax);
        System.out.println(imax);
        System.out.println(bmin);
        System.out.println(smin);
        System.out.println(imin);

    }
}
