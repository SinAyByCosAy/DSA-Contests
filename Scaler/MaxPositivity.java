//find SA with max number of positive elements
package Contests.Scaler;

import java.util.Arrays;
import java.util.Scanner;

public class MaxPositivity {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int final_l = 0, final_r = 0, l = 0, r = 0;
        int max_size = 0, size = 0;
        for(int i=0;i<n;i++){
            if(arr[i] > 0){
                size ++;
                r = i;
            }
            if(arr[i] < 0 || i == n-1){
                if(size > max_size){
                    max_size = size;
                    final_l = l;
                    final_r = r;
                }
                size = 0;
                l = r = i+1;
            }
        }
        int result[] = new int[max_size];
        int index = 0;
        for(int i=final_l;i<=final_r;i++){
            result[index++] = arr[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
//TC -> O(N)
//SC -> O(1)