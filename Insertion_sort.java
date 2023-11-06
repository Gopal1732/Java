public class Insertion_sort {
    
    public static void main(String[] args) {
         
        int arr[]={12,56,87,5,98};

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println(arr[i]+" "+arr[i+1]);
                int temp=arr[i+1];
                int j=i;
                while(j>=0 && arr[j]>temp)
            }
        }
    }
}
