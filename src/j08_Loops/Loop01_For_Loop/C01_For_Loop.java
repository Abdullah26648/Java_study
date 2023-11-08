package j08_Loops.Loop01_For_Loop;

public class C01_For_Loop {
    public static void main(String[] args) {
        // Loop -> tekrarlayan sabit aksiyonlar icin tanimlanan komut bloklaridir.
        // task -> 41 kere "Maasallah" print eden kod yaziniz.
        for (int i = 1; i < 42 ; i++) {
            System.out.println("Maasallah");
        }
        // task -> 2 basamakli tek sayilari ayni satira aralarinda bosluk ile print eden code yaziniz.
        for (int j = 11 ; j <100 ; j+=2) {
            System.out.print(j);
        }
        System.out.print("\n*****\n");

        for (int j = 1; j < 100 ; j++){
            if (j>=10 && j%2==1){
                System.out.print(j);
            }
        }
        /* Code standarts
        1) Tekrar (Repetition) olmamalidir
        2) Dynamic olmalidir
        3) Tamir (Fix) ve update kolay yapilabilmelidir. */
    }
}