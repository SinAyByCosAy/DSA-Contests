/*
URL : https://codeforces.com/contest/1836/problem/A

 */
package Contests.Codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Destroyer {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(n+1, 0));
            for(int i=1;i<=n;i++){
                int ele = sc.nextInt();
                if(ele < n) {
                    list.set(ele, list.get(ele)+1);
                }else{
                    list.set(n, Integer.MAX_VALUE);
                }
            }
//            System.out.println(list);
            boolean flag = true;
            for(int i=1;i<=n;i++){
                if(list.get(i) > list.get(i-1)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
