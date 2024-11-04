import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        int isTrue=1;
        char[] tca = str.toCharArray();
        int len = tca.length;
        for(int i=0;i<len/2;i++){
            if(tca[i]!=tca[len-i-1]) {
                isTrue = 0;
                break;
            }
        }
        System.out.print(isTrue);
    }
}