import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        for(int i = 0; i<num; i++){
            if(num == check(i)){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }

    private static int check(int now){
        int sum = now;
        char[] text = String.valueOf(now).toCharArray();
        for (int i = 0; i < text.length; i++) {
            sum += Character.getNumericValue(text[i]);
        }
        return sum;
    }

}