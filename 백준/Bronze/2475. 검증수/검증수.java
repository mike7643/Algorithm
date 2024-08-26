import java.util.*;
import java.io.*;

class Main{
    
    public static void main(String []args) {
        int[] a = new int[5];
        int num=0, fin;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            a[i] =sc.nextInt();
            num += a[i] * a[i];
        }
        fin =num % 10;
        System.out.print(fin);
    }
}