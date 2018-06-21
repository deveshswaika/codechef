// program link --> https://www.codechef.com/problems/APPROX
// solution below

import java.util.*;

class Approximately {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k;
        int temp,truncate,ans;
        truncate = 33102;
        ans = 3;
        for (int i = 0; i < t; i++) {
            int remainder = 4687;
            k = sc.nextInt();
            int a[] = new int[k];
            if (k == 0) {
                System.out.println(ans);
              }
            else {
                int j = 0;
                while (j < k) {
                    remainder *= 10;
                    a[j] = remainder / truncate;
                    remainder = remainder % truncate;
                    j++;
                }
                System.out.print("3.");
                for (int x = 0; x < k; x++) {
                    System.out.print(a[x]);
                  }
                System.out.println();
            }
        
    }
}



