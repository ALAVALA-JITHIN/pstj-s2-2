import java.util.*;

public class Main {

    public static List<Integer> compareTriplets(
            List<Integer> a, List<Integer> b) {

        int alice = 0;
        int bob = 0;

        for (int i = 0; i < 3; i++) {

            if (a.get(i) > b.get(i)) {
                alice++;
            } 
            else if (a.get(i) < b.get(i)) {
                bob++;
            }
        }

        return Arrays.asList(alice, bob);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        // Alice's ratings
        for (int i = 0; i < 3; i++) {
            a.add(sc.nextInt());
        }

        // Bob's ratings
        for (int i = 0; i < 3; i++) {
            b.add(sc.nextInt());
        }

        List<Integer> result = compareTriplets(a, b);

        System.out.println(result.get(0) + " " + result.get(1));

        sc.close();
    }
}

output:
5 6 7
3 6 10
  5 > 3  → Alice +1
6 = 6  → Nobody
7 < 10 → Bob +1

  Alice = 1
Bob   = 1
  1 1
