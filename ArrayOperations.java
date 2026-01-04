import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

    static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static int linearSearch(int[] arr, int n, int key) {
        for (int i = 0; i < n; i++)
            if (arr[i] == key)
                return i;
        return -1;
    }

    static int binarySearch(int[] arr, int n, int key) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n = 0, choice;

        do {
            System.out.println("\n1.Insert 2.Delete 3.Linear Search 4.Binary Search");
            System.out.println("5.Max 6.Count Even/Odd 7.Sort 0.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    arr[n++] = sc.nextInt();
                    break;

                case 2:
                    n--;
                    break;

                case 3:
                    System.out.println(linearSearch(arr, n, sc.nextInt()));
                    break;

                case 4:
                    insertionSort(arr, n);
                    System.out.println(binarySearch(arr, n, sc.nextInt()));
                    break;

                case 5:
                    System.out.println("Max: " + Arrays.stream(arr, 0, n).max().getAsInt());
                    break;

                case 6:
                    int even = 0, odd = 0;
                    for (int i = 0; i < n; i++)
                        if (arr[i] % 2 == 0) even++; else odd++;
                    System.out.println("Even: " + even + " Odd: " + odd);
                    break;

                case 7:
                    insertionSort(arr, n);
                    System.out.println(Arrays.toString(Arrays.copyOf(arr, n)));
            }
        } while (choice != 0);
    }
}

