import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Deque<Integer> deque = new ArrayDeque<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            deque.addLast(value);
        }

        System.out.println("Deque: " + deque);

        System.out.print("Enter element to add at front: ");
        int front = sc.nextInt();
        deque.addFirst(front);

        System.out.print("Enter element to add at rear: ");
        int rear = sc.nextInt();
        deque.addLast(rear);

        System.out.println("After adding elements: " + deque);

        deque.removeFirst();
        deque.removeLast();

        System.out.println("After removing first and last: " + deque);

        sc.close();
    }
}
//output
Enter the number of elements: 4
Enter the elements:
10 20 30 40
Deque: [10, 20, 30, 40]

Enter element to add at front: 5
Enter element to add at rear: 50

After adding elements: [5, 10, 20, 30, 40, 50]
After removing first and last: [10, 20, 30, 40]
