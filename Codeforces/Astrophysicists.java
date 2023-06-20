/*
URL: https://codeforces.com/contest/1836/problem/B
 */
package Contests.Codeforces;

import java.util.Scanner;

public class Astrophysicists {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int g = sc.nextInt();
            int rmax = (g-1)/2;
            int saved = 0;
            if(n * rmax >= k * g){
                System.out.println(k*g);
            }else{
                saved += (n-1) * rmax;
                int remaining = k * g - (n-1) * rmax;
                if(remaining % g >= g/2){
                    saved -= g - remaining % g;
                }else{
                    saved += remaining % g;
                }
                System.out.println(saved);
            }
        }
    }
}
