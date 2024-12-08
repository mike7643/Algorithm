import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int clothes=0;
        int pen;
        int penLast;
        int[]arr= new int[6];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i]=sc.nextInt();
        }
        int t = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if (t < arr[i]) { //t보다 클때
                if (arr[i] % t == 0) {//나눴을때 나머지 0이면
                    clothes += (arr[i] / t);
                }
                else clothes += (arr[i] / t)+1;
            } else if (t == arr[i]) {//t랑 같을때
                clothes++;
            } else{//t보다 작을때
                if (arr[i] > 0) {
                    clothes++;
                }
            }
        }

        int p = sc.nextInt();

        pen = n/p;
        penLast = n%p;

        System.out.println(clothes);
        System.out.print(pen+" "+penLast);
    }
}