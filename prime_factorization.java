import java.util.*;

public class prime_factorization {
    static boolean prime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
            
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t=n;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 2; i <= t; i++) {
            if (prime(i)) {
                while (n % i == 0) {
                    arr.add(i);
                    n = n / i;
                }

            }
        }

        System.out.println(arr);

    }

}
