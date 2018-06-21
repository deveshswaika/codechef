import java.util.*;
class Approximately {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k;
        int temp;
        for (int i = 0; i < t; i++) {
            int remainder = 4687;
            k = sc.nextInt();
            int a[] = new int[k];
            if (k == 0)
                System.out.println(3);
            else {
                int j = 0;
                while (j < k) {
                    remainder *= 10;
                    a[j] = remainder / 33102;
                    remainder = remainder % 33102;
                    j++;
                }
                System.out.print("3.");
                for (int x = 0; x < k; x++)
                    System.out.print(a[x]);
                System.out.println();
            }
        }
    }
}