import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = (br.readLine()).split("");
        Arrays.sort(split, Collections.reverseOrder());

        for (String s : split) {
            System.out.print(s);
        }
    }
}