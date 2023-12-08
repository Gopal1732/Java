public class heapsort {
    
    public static void main(String[] args) {
        
    }static void heapify(int[] arr, int n, int pindex) {
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
}
