import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
           set.add(sc.nextInt());
        }

        int m = sc.nextInt();
        LinkedHashSet<Integer> exist = new LinkedHashSet<>();

        for (int i = 0; i < m; i++) {
            exist.add(sc.nextInt());
        }

        Iterator<Integer> iter = exist.iterator();
        while (iter.hasNext()) {
            if (set.contains(iter.next())) {
                System.out.print(1+" ");
            }else System.out.print(0+" ");
        }
    }
}