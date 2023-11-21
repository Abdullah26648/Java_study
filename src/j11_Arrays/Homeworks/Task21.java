package j11_Arrays.Homeworks;

public class Task21 {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu: verilen Arrayın Ayna array olmasını kontrol eden code create ediniz
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
        int arr[] = {1, 2, 7, 4, 4, 3, 2, 1};

        if (isMirrorArray(arr)) {
            System.out.println("The given array is symmetric.");
        } else {
            System.out.println("The given array is not symmetric.");
        }
    }
    static boolean isMirrorArray(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}