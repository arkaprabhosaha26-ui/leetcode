public class problem6 {

  public static int maxProduct(int[] nums) {

    int maxProduct = nums[0];

    for (int i = 0; i < nums.length; i++) {

      int product = 1;

      for (int j = i; j < nums.length; j++) {

        product = product * nums[j];

        if (product > maxProduct) {
          maxProduct = product;
        }
      }
    }

    return maxProduct;
  }

  public static void main(String[] args) {

    int[] nums = { -2, 3, -4 };

    int result = maxProduct(nums);

    System.out.println("Maximum Product: " + result);
  }
}
