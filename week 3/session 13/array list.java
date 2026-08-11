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

        System.out.println("ArrayList: " + list);

        System.out.print("Enter an element to add: ");
        int add = sc.nextInt();
        list.add(add);

        System.out.println("ArrayList after adding: " + list);

        System.out.print("Enter an element to remove: ");
        int remove = sc.nextInt();

        list.remove(Integer.valueOf(remove));

        System.out.println("ArrayList after removing: " + list);

        sc.close();
    }
}

//output
Enter the number of elements: 5
Enter the elements:
10 20 30 40 50
ArrayList: [10, 20, 30, 40, 50]

Enter an element to add: 60
ArrayList after adding: [10, 20, 30, 40, 50, 60]

Enter an element to remove: 30
ArrayList after removing: [10, 20, 40, 50, 60]
