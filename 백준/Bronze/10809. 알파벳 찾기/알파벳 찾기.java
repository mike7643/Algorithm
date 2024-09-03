import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];
        String word = sc.next();

        for(int i =0;i<26;i++){
            arr[i]=-1;
            for(int j = 0;j<word.length();j++){
                char al = word.charAt(j);
                int alnum=(int)al;
                if(i==alnum-97 && arr[i]==-1) {
                    arr[i] = j;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }
}