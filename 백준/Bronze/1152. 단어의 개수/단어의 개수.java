import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        String make = sen.trim();
        String change = make.replaceAll("\\s+"," ");
        if(change.isBlank()){
            System.out.println(0);
        }
        else{
        String[] res = change.split(" ");
        System.out.println(res.length);
        }
    }
}