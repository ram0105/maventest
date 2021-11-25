package malvika;

import java.util.Scanner;
public abstract class Sorting {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        int totalElements = sc.nextInt();

        int[] arr = new int[totalElements];
        for (int i = 0; i < totalElements; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sortElements(arr);
    }

    public static void sortElements(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order::: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
