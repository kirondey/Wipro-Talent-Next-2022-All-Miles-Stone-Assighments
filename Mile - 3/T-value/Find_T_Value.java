//! Find T Value

import java.util.Scanner;

public class Find_T_Value {
    public static int find_tvalue(int input1, int input2, int input3) {
        int res = 0;
        if (isPrime(input2) == true && input2 % 2 == 0) {
            res = input1 * input1 * solve(input2);
        } else if (isPrime(input2) == true && input2 % 2 != 0) {
            res = input2 * input2 * solve(input3);
        } else if (isPrime(input2) == false && input2 % 2 == 0) {
            res = input3 * input3 * solve(input2 + input3);
        } else {
            res = solve(input1 + input2 + input3);
        }
        if (isPrime(res) == true) {
            res = res + input3;
        } else {
            res = res - input3;
        }
        return res;
    }

    public static int solve(int n) {
        int sum = 0, i = 1, j;
        while (n != 0) {
            int count = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sum = sum + i;
                n--;
            }
            i++;
        }
        return sum;
    }

    public static boolean isPrime(int input) {
        if (input <= 1)
            return false;
        else if (input == 2)
            return true;
        else if (input % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(input); i += 2) {
            if (input % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();

        System.out.println(find_tvalue(input1, input2, input3));

    }
}
