package j24_Inheritance.Inheritance01;

public class Runner {
        /*
        1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
        2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
        3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
        4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları için kullanılır.
        5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
        6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
        7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
          denir.
        8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
        9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir
        */
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.moves();
        a1.eats();
        a1.drinks();

        Fish b1 = new Fish();
        b1.Grilling_Fish();
        b1.moves();
        b1.eats();
        b1.drinks();

        Mammal c1 = new Mammal();
        c1.feedswithmilk();
        c1.givesbirth();
        c1.moves();
        c1.eats();
        c1.drinks();

        Sheep d1 = new Sheep();
        d1.Graze();
        d1.feedswithmilk();
        d1.givesbirth();
        d1.moves();
        d1.eats();
        d1.drinks();

        Cat e1 = new Cat();
        e1.Scratches();
        e1.feedswithmilk();
        e1.givesbirth();
        e1.moves();
        e1.eats();
        e1.drinks();
    }
}