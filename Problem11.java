/* public class problem10 {
  public static int water(int[] arr) {
    int maxWater = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        int width = j - i;
        int minHeight = Math.min(arr[i], arr[j]);
        int area = width * minHeight;
        if (area > maxWater) {
          maxWater = area;
        }
      }
    }
    return maxWater;

  }

  public static void main(String[] args) {
    int[] arr = { 2, 5, 4, 3 };
    int result = water(arr);
    System.out.println(result);
  }
}




 */

public class Problem11 {

  public static int maxArea(int[] height) {

    int maxWater = 0;

    int i = 0;
    int j = height.length - 1;

    while (i < j) {

      int width = j - i;

      int minHeight = Math.min(height[i], height[j]);

      int area = width * minHeight;

      if (area > maxWater) {
        maxWater = area;
      }

      if (height[i] < height[j]) {
        i++;
      } else {
        j--;
      }
    }

    return maxWater;
  }

  public static void main(String[] args) {

    int[] height = { 2, 5, 4, 3 };

    int result = maxArea(height);

    System.out.println("Maximum Water: " + result);
  }
}
