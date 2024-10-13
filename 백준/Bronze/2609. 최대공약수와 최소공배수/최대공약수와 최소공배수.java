import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int one = sc.nextInt();
        int two = sc.nextInt();
        
        int GCD = findGCD(one, two);
        int LCM = GCD*(one/GCD)*(two/GCD);
        
        System.out.println(GCD);
        System.out.println(LCM);
    }
    
    private static int findGCD(int one, int two){
        int a = Math.max(one, two);
        int b = Math.min(one, two);
        int r = 1;
        int temp =0;
        
        while(r!=0){
        r = a%b;
        a=b;
        temp = b;
        b=r;
        }
        return temp;
    }
}