class Main {

//   Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.

// Example 1:

// Input: [2, 1, 5, 1, 3, 2], k=3 
// Output: 9
// Explanation: Subarray with maximum sum is [5, 1, 3].

//   Example 2:

// Input: [2, 3, 4, 1, 5], k=2 
// Output: 7
// Explanation: Subarray with maximum sum is [3, 4].

  public static int maximumSumOfAnyContiguousSubArraysOfK(int k, int[] arr) {
    int result = 0;
    int start = 0;
    int sum = 0;
    for (int end = 0; end < arr.length; end++) {
      sum += arr[end];
      if (end >= k - 1) {
        result = greaterOfTwo(result, sum);
        // result = Math.max(result, sum);
        sum -= arr[start];
        start++;
      }
    }
    return result;
  }

  private static int greaterOfTwo(int result, int sum) {
    if (result > sum) {
      return result;
    } else {
      return sum;
    }
  }

  public static void main(String[] args) {
    int result = Main.maximumSumOfAnyContiguousSubArraysOfK(3, new int[] { 2, 1, 5, 1, 3, 2 });
    System.out.println("----" + result);
  }
}