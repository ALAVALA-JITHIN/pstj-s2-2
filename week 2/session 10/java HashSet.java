import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        System.out.println("HashSet: " + set);

        System.out.print("Enter element to search: ");
        int value = sc.nextInt();

        if (set.contains(value)) {
            System.out.println(value + " is present in the HashSet");
        } else {
            System.out.println(value + " is not present in the HashSet");
        }

        System.out.print("Enter element to remove: ");
        int remove = sc.nextInt();

        set.remove(remove);

        System.out.println("HashSet after removal: " + set);

        sc.close();
    }
}
//output

Enter the number of elements: 6
Enter the elements:
10 20 30 20 40 10
HashSet: [20, 40, 10, 30]

Enter element to search: 30
30 is present in the HashSet

Enter element to remove: 20
HashSet after removal: [40, 10, 30]
