import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] def = {1,1,2,2,2,8};
        int[] find = new int[6];
        int[] need = new int[6];
        for(int i=0;i<6;i++){
            find[i]=sc.nextInt();
            need[i]=def[i]-find[i];
        }
        for(int res : need)
            System.out.print(res+" ");
    }
}