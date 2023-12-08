// Heap Sort is possible only if we have complete binary tree.

import java.util.Arrays;

public class Heap_sort {

    static void heapify(int[] arr, int n, int pindex) {
        int leftchild = 2 * pindex + 1;
        int rightchild = 2 * pindex + 2;

        int largestindex = pindex;

        if (leftchild < n && arr[leftchild] < arr[pindex]) {
            largestindex = leftchild;
        }
        if (rightchild < n && arr[rightchild] < arr[pindex]) {
            largestindex = rightchild;
        }
        if (largestindex == pindex) {
            return;
        } else {
            int temp = arr[largestindex];
            arr[largestindex] = arr[pindex];
            arr[pindex] = temp;

            heapify(arr, n, largestindex);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 12, 65, 34, 76, 98 };
        int n = arr.length;

        for (int i = (n - 1) / 2; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Heap Sort
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
            // System.out.println("Heap Sort Array: " + Arrays.toString(arr));
        }

        System.out.println("Heap Sort Array: " + Arrays.toString(arr));


    }
}
