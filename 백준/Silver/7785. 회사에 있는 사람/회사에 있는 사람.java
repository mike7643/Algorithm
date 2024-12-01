import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<String, String> map = new TreeMap<>();

        for(int i = 0; i<n ; i++){
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }

        Set<String> keySet = map.keySet();
        List<String> list = new ArrayList<>(keySet);

        Collections.sort(list, Comparator.reverseOrder());

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String next = iter.next();
            if (map.get(next).equals("enter")) {
                System.out.println(next+" ");
            }
        }
    }
}