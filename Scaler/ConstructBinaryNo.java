//construct a binary number having a 1's followed by b 0s
//i/p -> A = 3, B = 2 -> 11100 in binary
//o/p -> 28 in decimal
package Contests.Scaler;

import java.util.Scanner;

public class ConstructBinaryNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println((((1 << A) - 1) << B));
    }
}
