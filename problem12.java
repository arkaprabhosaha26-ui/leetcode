public class problem12 {
  public static int findNumbers(int[] arr) {
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
      int n = arr[i];
      int count = 0;
      while (n > 0) {
        count++;
        n = n / 10;
      }
      if (count % 2 == 0) {
        total++;
      }
    }
    return total;
  }

  public static void main(String[] args) {
    int[] arr = { 12, 345, 67, 2134 };
    int result = findNumbers(arr);
    System.out.println(result);
  }
}

// optimsed solution

/*
 * import java.util.Arrays;
 * 
 * class Solution {
 * public int[] sortedSquares(int[] arr) {
 * 
 * int left = 0;
 * int right = arr.length - 1;
 * 
 * int[] result = new int[arr.length];
 * 
 * int index = arr.length - 1;
 * 
 * while (left <= right) {
 * 
 * int leftSquare = arr[left] * arr[left];
 * int rightSquare = arr[right] * arr[right];
 * 
 * if (leftSquare > rightSquare) {
 * 
 * result[index] = leftSquare;
 * left++;
 * 
 * } else {
 * 
 * result[index] = rightSquare;
 * right--;
 * 
 * }
 * 
 * index--;
 * }
 * 
 * return result;
 * }
 * 
 * public static void main(String[] args) {
 * 
 * Solution obj = new Solution();
 * 
 * int[] arr = { -7, -3, 2, 4, 8 };
 * 
 * int[] answer = obj.sortedSquares(arr);
 * 
 * System.out.println(Arrays.toString(answer));
 * }
 * }
 */