package j26_Abstract.abstarct01;

public class Accord extends Honda {// concrete  child Class
    @Override
    public void motor() {
        System.out.println("Agam 2.0 turbo motor cok yakar cabuk kaçar \nHız felakettir :(");
    }

    @Override
    void koltuk() {
        System.out.println("Agam deri koltuk ter yapar pişik olmayasın ");

    }

    @Override
    void kapi() {
        System.out.println("Ağam gevurun malı mı yavaş kapatasan");
    }

    @Override
    void sunroof() {
        System.out.println("Agam cuğara yakınca sunroof açmayı unutma ");
    }
}