import java.util.Scanner;

public class Main {

    public static int largestAltitude(int[] gain) {
        int altitude = 0;
        int highest = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude = altitude + gain[i];

            if (altitude > highest) {
                highest = altitude;
            }
        }

        return highest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] gain = new int[n];

        System.out.println("Enter gain values:");
        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }

        int result = largestAltitude(gain);

        System.out.println("Highest altitude: " + result);

        sc.close();
    }
}


//output
Enter the size of array: 5
Enter gain values:
-5 1 5 0 -7
Highest altitude: 1
