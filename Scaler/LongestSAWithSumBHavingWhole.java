//https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems
package Contests.Scaler;

import java.util.Scanner;

public class LongestSAWithSumBHavingWhole {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter sum");
        int k = sc.nextInt();
        int l = 0, r = 0, len = 0;
        long sum = a[0];
        while(r < n){
            while(l<=r && sum > k){
                sum -= a[l];
                l++;
            }
            if(sum == k){
                len = Math.max(len, r-l+1);
            }
            r++;
            if(r<n)
                sum += a[r];
        }
        System.out.println(len);
    }
}
//TC -> O(N)
//SC -> O(1)