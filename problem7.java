public class problem7 {

  public static int findMin(int[] nums) {

    int min = nums[0];

    for (int i = 1; i < nums.length; i++) {

      if (nums[i] < min) {
        min = nums[i];
      }
    }

    return min;
  }

  public static void main(String[] args) {

    int[] nums = { 5, 6, 7, 1, 2, 3, 4 };

    int result = findMin(nums);

    System.out.println("Minimum: " + result);
  }
}