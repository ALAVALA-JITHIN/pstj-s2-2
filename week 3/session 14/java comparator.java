import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Original list: " + list);

        // Sort in ascending order
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });

        System.out.println("Ascending order: " + list);

        // Sort in descending order
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });

        System.out.println("Descending order: " + list);

        sc.close();
    }
}
//output

Enter the number of elements: 5
Enter the elements:
40 10 50 20 30
Original list: [40, 10, 50, 20, 30]
Ascending order: [10, 20, 30, 40, 50]
Descending order: [50, 40, 30, 20, 10]
