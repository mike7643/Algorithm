import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int toGetFour=0;
        int parsed=0;

        for (int i = 0; i < 3; i++) {
            String a = br.readLine();
            if (a.charAt(0) > 48 && a.charAt(0) < 58) {
                parsed = Integer.parseInt(a);
                toGetFour=i;
            }
        }
        printer(parsed+3-toGetFour);
    }

    private static void printer(int i) {
        if (i % 15 == 0) {
            System.out.print("FizzBuzz");
        } else if (i % 3 == 0 && i % 5 != 0) {
            System.out.print("Fizz");
        } else if (i % 3 != 0 && i % 5 == 0) {
            System.out.print("Buzz");
        }else System.out.println(i);
    }
}
