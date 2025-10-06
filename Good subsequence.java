import java.util.Scanner;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            if (N == 0) {
                System.out.println(0);
                continue;
            }
            int A[] = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int length = 1;
            int lastParity = A[0] % 2;

            for (int i = 1; i < N; i++) {
                int currentParity = A[i] % 2;
                if (currentParity != lastParity) {
                    length++;
                    lastParity = currentParity;
                }
            }
            System.out.println(length);
        }
        sc.close();
    }
}
