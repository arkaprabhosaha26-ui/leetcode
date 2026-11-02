public class problem9 {

  public static int search(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {

      if (nums[i] == target) {
        return i;
      }
    }

    return -1;
  }

  public static void main(String[] args) {

    int[] nums = { 6, 7, 8, 1, 2, 3, 4 };

    int target = 3;

    int result = search(nums, target);

    System.out.println("Index: " + result);
  }
}