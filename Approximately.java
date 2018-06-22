// program link --> https://www.codechef.com/problems/APPROX
// solution below

import java.util.*;

class Approximately {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num_test_cases = sc.nextInt();
        int k;
        int temp, truncate, num_int_part;
        truncate = 33102;
        num_int_part = 3;
        for (int i = 0; i < num_test_cases; i++) {
            int remainder = 4687;
            k = sc.nextInt();
            int num_decimal_digit[] = new int[k];
            if (k == 0) {
                System.out.println(num_int_part);
            }
            else {
                int j = 0;
                while (j < k) {
                    remainder *= 10;
                    num_decimal_digit[j] = remainder / truncate;
                    remainder = remainder % truncate;
                    j++;
                }
                System.out.print("3.");
                for (int x = 0; x < k; x++) {
                    System.out.print(num_decimal_digit[x]);
                }
                System.out.println();
            }
        }
    }
}

