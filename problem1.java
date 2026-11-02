public class problem1 {

  public static int[] twoSum(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
          return new int[] { i, j }; // {0,3}
        }
      }
    }
    return new int[] {}; // empty
  }

  public static void main(String[] args) {
    int[] arr = { 4, 5, 8, 3 };
    int target = 7;
    int[] result = twoSum(arr, target);
    System.out.println("INDICES: ");
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    } // traversing

  }
}
