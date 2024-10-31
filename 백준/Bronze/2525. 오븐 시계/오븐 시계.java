import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int hour =sc.nextInt();
        int min =sc.nextInt();
        int add =sc.nextInt();
        
        min+=add;
        if(min>59){
            hour+=min/60;
            min%=60;
        }
        
        if(hour>23){
            hour-=24;
        }
        
        System.out.print(hour+" "+min);
    }
}