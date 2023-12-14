package j29_Collection.p01_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {
        /*
        Queue coll. interface oldg için child calss olan LinkedList ve PriorityQueue
        ile obj uretilir.
        Eczane yemekhane vs belirli şart ile aksiyon alan elemanlar için kullanılır.
        Const seçimine göre queue obj özelliklieri belirlenir.
        FİFO -> first in first out: Coll. ilk giren eleman ilk çıkar.Elemen en sona eklenir enbaştan silinir.
        */
        Queue<String> q1 = new LinkedList<>(Arrays.asList("javaCAN","javİDAN","jaVİYE","javaSU","javaHAN","javaZADE"));
        System.out.println("q1 = " + q1);
        q1.add("javaDENIZ");
        System.out.println("q1 after add: " + q1);
        Queue<String> q2 = new PriorityQueue<>(Arrays.asList("jaBAN","javaZAN","javaCEP","Busura"));
        System.out.println("q2 = " + q2);
        q2.add("javaCARDI");
        System.out.println("q2 after add " + q2);
        System.out.println("q2.peek() = " + q2.peek());
        System.out.println("q2.element() = " + q2.element());
        System.out.println("q2.size(before) = " + q2.size());
        System.out.println("q2.isEmpty() = " + q2.isEmpty());
        q2.clear();
        System.out.println("q2.size(after) = " + q2.size());
        System.out.println("q2.isEmpty() = " + q2.isEmpty());
        System.out.println("q2.peek() = " + q2.peek());
        //System.out.println("q2.element() = " + q2.element());
        System.out.println("THE END");
        /*
        peek()-> copy-paste gibi ilk elemanı return eder ama silmez :gözetleme
        poll()-> cut-paste gibi ilk elemanı siler ve  return eder : kesme
        element() -> ilk elemanı silmeden return eder.
        remove() -> ilk elemanı siler ve return eder.. :kaldırma

        ahan da Trick kösesinde bugun : poll ve remove farkı ->  eger queue coll. boş ise remove NoSuchElementException
        poll ise null return eder.
        */

        System.out.println("q2.poll() = " + q2.poll());
        //System.out.println("q2.remove() = " + q2.remove());
        q2.add("javaT");
        q2.add("javaHIR");
        System.out.println("q2 = " + q2);
        System.out.println("THE END");

        // ahan da Trick kösesinde bugun : offer()-> queue coll. eleman eklemek için kullanılır. queue'de eleman kısıtlaması varsa add() meth. rte
        // fırlatırken offer() true-false return eder.

        q2.offer("falan");
        System.out.println("q2 after offer: " + q2);
        System.out.println("q2 = " + q2);
    }
}
