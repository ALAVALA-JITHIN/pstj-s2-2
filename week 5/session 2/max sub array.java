public static List<Integer> maxSubarray(List<Integer> arr) {

    int currentSum = arr.get(0);
    int maxSubarray = arr.get(0);

    int maxPositive = 0;
    int maxElement = arr.get(0);

    for (int i = 0; i < arr.size(); i++) {

        int value = arr.get(i);

        // Maximum subarray
        if (i > 0) {
            currentSum = Math.max(value, currentSum + value);
            maxSubarray = Math.max(maxSubarray, currentSum);
        }

        // Maximum subsequence
        if (value > 0) {
            maxPositive += value;
        }

        maxElement = Math.max(maxElement, value);
    }

    int maxSubsequence;

    if (maxPositive > 0) {
        maxSubsequence = maxPositive;
    } else {
        maxSubsequence = maxElement;
    }

    List<Integer> result = new ArrayList<>();
    result.add(maxSubarray);
    result.add(maxSubsequence);

    return result;
}

//output:
Input:
6
-1 2 3 -4 5 10

  16 20
