// program link --> https://www.codechef.com/problems/APPROX
// solution below

import java.util.Scanner;

class Approximately {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num_test_cases = sc.nextInt();
        int NUMERATOR = 103993;
        int DENOMINATOR = 33102;
        int int_part = NUMERATOR / DENOMINATOR;
        for (int i = 0; i < num_test_cases; i++) {
            int num_decimal_digits = sc.nextInt();           
            String fraction = calculate_fraction(NUMERATOR, DENOMINATOR, num_decimal_digits);
            System.out.println(fraction);
        }
    }
    
    public static String calculate_fraction(int numerator, int denominator, int num_decimal_digits) {
        if (num_decimal_digits == 0) {
            return String.valueOf(numerator / denominator);
        }
        else {
            int remainder = numerator % denominator;
            int digits[] = new int[num_decimal_digits];
            int j = 0;
            while (j < num_decimal_digits) {
                remainder *= 10;
                digits[j] = remainder / denominator;
                remainder = remainder % denominator;
                j++;
            }
            String fraction =  String.valueOf(numerator / denominator) + ".";
            for (int x = 0; x < num_decimal_digits; x++) {
                fraction = fraction.concat(String.valueOf(digits[x]));
            }
            return fraction;
        }
    }
}

