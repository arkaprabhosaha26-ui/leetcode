public class problem3 {
  public static int maxSubSum(int[] arr) {
    int maxSum = arr[0];
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
          sum = sum + arr[k];
        }
        if (sum > maxSum) {
          maxSum = sum;
        }
      }
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int[] arr = { -3, 5, -2, 4 };
    int result = maxSubSum(arr);

    System.out.println("Maximum sum: " + result);
  }
}
