package j18_StringBuilder;

import java.time.LocalTime;

public class C01_StringBuilder {
    public static void main(String[] args) {
        /*
        String = > daha yavas ,Immutable==> degismez,
        String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

        1) Java pass-by-value kullanir. -> makyaj dublor
        2) String Class'i immutable Class'dir. meth datayı değişmez

        StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
        StringBuffer synchronized,thread safe.

        StringBuilders = mutable==>degisebilir ,
        not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

        1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
        StringBuilder isimli bir class uretmistir.
        2) Java'da StringBuilder ile hemen hemen ayni isi yapan bir de StringBuffer classi vardir.
        "StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
        "StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
        "StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
        3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
        Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.
		*/

        String name = "";
        System.out.println("name: "+name);
        name += "QA tester ";
        System.out.println("name: "+name);
        name += "Seckin ";
        System.out.println("name: "+name);

        System.out.println("Method call oncesi name : "+name);
        strBirlestir(name);
        System.out.println("Method call sonrasi name : "+name);

        // task-> 3333 tekrarlı loop ile String variable ve StringBuilder obj run time surelerini karşılaştıran code create ediniz

        String str = "";
        StringBuilder sb = new StringBuilder();
        System.out.println("   ***   str loop   ***   ");
        LocalTime strStart = LocalTime.now();

        for (int i = 0; i < 3333; i++){
            str += i;
        }

        LocalTime strFinish = LocalTime.now();
        System.out.println("str run time: "+(strFinish.getNano() - strStart.getNano()));

        System.out.println("   ***   sb loop   ***   ");
        LocalTime sbStart = LocalTime.now();

        for (int i = 0; i < 3333; i++){
            sb.append(i);
        }

        LocalTime sbFinish = LocalTime.now();
        System.out.println("sb run time: "+(sbFinish.getNano() - sbStart.getNano()));
    }

    private static void strBirlestir(String str) {
        System.out.println(str + "Method call edildi dewamkeee :)");
    }

}