public class Insertion_sort {
    
    public static void main(String[] args) {
         
        int arr[]={12,56,87,5,98};

        for(int i=0;i<arr.length-1;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
