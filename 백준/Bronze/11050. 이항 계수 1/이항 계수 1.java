import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        int res = factorial(n) / ((factorial(r))*(factorial(n-r)));

        System.out.println(res);
    }

    public static int factorial(int i){
        int a =1;

        while(i>1){
            a*=i;
            i--;
        }
        return a;
    }
}