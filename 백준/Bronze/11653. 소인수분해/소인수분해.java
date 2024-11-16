import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        if(n == 1)
            return;
        int a = n;

        int i =2;

        while(i<a) {
            if (a % i == 0) {
                a = a / i;
                list.add(i);
                i = 2;
                continue;
            }
            i++;
        }
        list.add(a);

        Arrays.sort(list.toArray());

        for(int j : list){
            System.out.println(j);
        }
    }
}
