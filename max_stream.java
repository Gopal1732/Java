import java.util.Scanner;

public class max_stream {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int max=n;
        while(n!=-1){
            max=Math.max(n,max);
            System.out.println("Max element is"+max);
            n=sc.nextInt();
        }
    }
}
