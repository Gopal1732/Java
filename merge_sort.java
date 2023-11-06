public class merge_sort {

    static void merge(int arr[], int arr2[]) {
        int ptr1 = 0;
        int ptr2 = 0;
        int output[] = new int[arr.length + arr2.length];

        int n1 = arr.length;
        int n2 = arr2.length;
        int outputindex = 0;

        while (ptr1 < n1 && ptr2 < n2) {
            if (arr[ptr1] < arr2[ptr2]) {
                output[outputindex] = arr[ptr1];
                ptr1++;
                outputindex++;
            } else {
                output[outputindex] = arr2[ptr2];
                ptr2++;
                outputindex++;
            }
        }

        while (ptr1 < n1) {
            output[outputindex] = arr[ptr1];
            ptr1++;
            outputindex++;
        }

       

    static void divide(int arr[],int start,int end){
        printarr(arr,start,end);
        if(start==end){
            return;
        }
        int mid=(start+end)/2;
        divide(arr,start,mid);
        divide(arr, mid+1, end);
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 3, 6, 9, 15 };
        int arr2[] = new int[] { 2, 4, 7, 8, 12 };

        merge(arr, arr2);

    }
}