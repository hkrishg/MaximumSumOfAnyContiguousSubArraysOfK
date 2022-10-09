class Main {

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
    // [2, 1, 5, 1, 3, 2], k=3 ------- > output = 9
    int result = Main.maximumSumOfAnyContiguousSubArraysOfK(3, new int[] { 2, 1, 5, 1, 3, 2 });
    System.out.println("----" + result);
  }
}