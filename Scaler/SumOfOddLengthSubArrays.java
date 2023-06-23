//https://leetcode.com/problems/sum-of-all-odd-length-subarrays/description/
package Contests.Scaler;

import java.util.Scanner;

public class SumOfOddLengthSubArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            int oddSACount = ((i+1) * (n-i) + 1)/2;
            sum += arr[i] * oddSACount;
        }
        System.out.println(sum);
    }
}
//TC -> O(N)
//SC -> O(1)
