import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        sc.close();
        
        String sec = String.valueOf(second);
        char[] secChar=sec.toCharArray();
        
        for(int i=secChar.length-1;i>=0;i--)
            System.out.println(first*(secChar[i]-'0'));
        System.out.println(first*second);
    }
}