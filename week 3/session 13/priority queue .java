import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        System.out.println("Priority Queue: " + pq);

        System.out.println("Smallest element: " + pq.peek());

        System.out.print("Elements in priority order: ");

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }

        sc.close();
    }
}

//output
Enter the number of elements: 6
Enter the elements:
40 10 30 50 20 60
Priority Queue: [10, 20, 30, 50, 40, 60]
Smallest element: 10
Elements in priority order: 10 20 30 40 50 60
