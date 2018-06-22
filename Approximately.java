// program link --> https://www.codechef.com/problems/APPROX
// solution below

import java.util.*;

class Approximately {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num_test_cases = sc.nextInt();
        int NUMERATOR = 103993;
        int DENOMINATOR = 33102;
        int int_part = NUMERATOR / DENOMINATOR;
        for (int i = 0; i < num_test_cases; i++) {
            int num_decimal_digits = sc.nextInt();           
            String truncated_number = calculate_fraction(NUMERATOR,DENOMINATOR,num_decimal_digits);
            System.out.println(truncated_number);
        }
    }
    
    public static String calculate_fraction(int NUMERATOR,int DENOMINATOR,int num_decimal_digits) {
        if(num_decimal_digits==0) {
            return String.valueOf(NUMERATOR / DENOMINATOR);
        }
        else {
            int remainder = NUMERATOR % DENOMINATOR;
            int digits[] = new int[num_decimal_digits];
            int j = 0;
            while (j < num_decimal_digits) {
                remainder *= 10;
                digits[j] = remainder / DENOMINATOR;
                remainder = remainder % DENOMINATOR;
                j++;
            }
            String truncated_num =  String.valueOf(NUMERATOR / DENOMINATOR) + ".";
            for (int x = 0; x < num_decimal_digits; x++) {
                truncated_num = truncated_num.concat(String.valueOf(digits[x]));
            }
            return truncated_num;
        }
    }
}


