//https://www.geeksforgeeks.org/queries-to-find-the-count-of-vowels-in-the-substrings-of-the-given-string/
package Contests.Scaler;

import java.util.Arrays;
import java.util.Scanner;

public class VowelsInARange {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int q = sc.nextInt();
        int b[][] = new int[q][2];
        for(int i=0;i<q;i++){
            b[i][0] = sc.nextInt();
            b[i][1] = sc.nextInt();
        }
        int psv[] = new int[s.length()];
        int result[] = new int[b.length];
        String v = "aeiou";
        psv[0] = (v.indexOf(s.charAt(0)) != -1) ? 1 : 0;
        for(int i=1;i<s.length();i++){//creating prefix array for vowel count which will give the info quickly
            if(v.indexOf(s.charAt(i)) != -1){
                psv[i] = psv[i-1] + 1;
            }else{
                psv[i] = psv[i-1];
            }
        }
        for(int i=0;i<q;i++){
            int l = b[i][0];
            int r = b[i][1];
            if(l == 0){
                result[i] = psv[r];
            }else{
                result[i] = psv[r] - psv[l-1];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
//TC -> O(N + Q)
//SC -> O(N)