package j02_DataTypes_WrapperClass;
/*
     Not: char variable'lari matematiksel islemlerde   ASCII degerleri kullanir.
          Ornegin; System.out.println('A' + 'C'); ekrana AC yerine 132 print eder.
     Note: Java'da "+" sembolunun
             i)Toplama islemi
             ii)Birlestirme Islemi(Concatenation)
           Java "+" sembolu  once toplama yapmaya calisir, yapamazsa birlestirme islemi yapılır aksi halde CTE verir.
  */
public class C03_Concatenation {
    public static void main(String[] args) {
        String ad="Furkan ";
        String soyad="Ekinci";
        int a = 17;
        int b = 61;
        System.out.println(ad+soyad+a+b);//
        System.out.println(a+ad+soyad+b);//
        System.out.println(a+b+ad+soyad);//
        System.out.println(a+b);//
        System.out.println(" "+a+b);//
        System.out.println(ad+soyad+(a+b));//
        System.out.println((a+b)+ad+soyad);//
        System.out.println(ad+(a-b)+(a+b));//
        System.out.println(ad+((a-b)+(a+b)));//
        char ch = '1';
        System.out.println(ad+ch);//
        System.out.println(a+ch+ad);//
        System.out.println(ad+(ch+b));//
        System.out.println(a+ad+ch);//

    }
}
