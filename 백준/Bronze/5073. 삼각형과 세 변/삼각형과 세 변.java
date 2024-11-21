import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a==0 && b==0 && c==0)
                break;

            int max=0;
            int total=a+b+c;

            if(b == c && a == c) {
                System.out.println("Equilateral");
                continue;
            }

            if(a>=max)
                max=a;
            if(b>max)
                max=b;
            if(c>max)
                max=c;

            if(max < total-max){
                if(a==b && b!=c)
                    System.out.println("Isosceles");
                else if(b==c && c!=a)
                    System.out.println("Isosceles");
                else if(a==c && c!=b)
                    System.out.println("Isosceles");
                else
                    System.out.println("Scalene");

            }else System.out.println("Invalid");
        }
    }
}