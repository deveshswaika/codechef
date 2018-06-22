// program link --> https://www.codechef.com/problems/APPROX
// solution below

import java.util.*;

class Approximately {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num_test_cases = sc.nextInt();
        int num_decimal_digits;
        int temp, int_part, NUMERATOR, DENOMINATOR;
        NUMERATOR = 103993;
        DENOMINATOR = 33102;
        int_part = 3;
        for (int i = 0; i < num_test_cases; i++) {
            int remainder = NUMERATOR % DENOMINATOR;
            num_decimal_digits = sc.nextInt();
            int digits[] = new int[num_decimal_digits];
            if (num_decimal_digits == 0) {
                System.out.println(int_part);
            }
            else {
                int j = 0;
                while (j < num_decimal_digits) {
                    remainder *= 10;
                    digits[j] = remainder / DENOMINATOR;
                    remainder = remainder % DENOMINATOR;
                    j++;
                }
                System.out.print("3.");
                for (int x = 0; x < num_decimal_digits; x++) {
                    System.out.print(digits[x]);
                }
                System.out.println();
            }
        }
    }
}

