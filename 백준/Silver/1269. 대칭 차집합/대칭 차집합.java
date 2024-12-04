import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt=0;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < a; i++)
            set1.add(sc.nextInt());
        for (int i = 0; i < b; i++)
            set2.add(sc.nextInt());

        for (Integer i : set1) {
            if (!set2.contains(i)) {
                cnt++;
            }
        }
        for (Integer i : set2) {
            if (!set1.contains(i)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}