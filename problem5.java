public class problem5 {

  public static int[] productExceptSelf(int[] nums) {

    int[] answer = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {

      int product = 1;

      for (int j = 0; j < nums.length; j++) {

        if (i != j) {
          product = product * nums[j];
        }
      }

      answer[i] = product;
    }

    return answer;
  }

  public static void main(String[] args) {

    int[] nums = { 2, 3, 4, 5 };

    int[] result = productExceptSelf(nums);

    System.out.println("Result:");

    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + " ");
    }
  }
}
