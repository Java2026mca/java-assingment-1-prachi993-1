import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int swaps = 0;

        // Bubble Sort
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }

        // Print sorted array
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
            if(i < n - 1) System.out.print(" ");
        }

        // Print swaps
        System.out.println();
        System.out.println("Swaps: " + swaps);
    }
}
