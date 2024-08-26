import java.util.*;
import java.io.*;

class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n,x;
        n = sc.nextInt();
        x = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int j = 0;j<n;j++){
            if(a[j]<x){
                System.out.print(a[j]+" ");
            }
        }
    }
}