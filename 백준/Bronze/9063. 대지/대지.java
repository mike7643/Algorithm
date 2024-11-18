import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int xmin=100000;
        int ymin=100000;
        int xmax=-10000;
        int ymax=-10000;


        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x<xmin)
                xmin=x;
            if(x>xmax)
                xmax=x;
            if(y<ymin)
                ymin=y;
            if(y>ymax)
                ymax=y;
        }

        System.out.print((xmax-xmin)*(ymax-ymin));
    }
}