public class problem2 {
  public static boolean repeatNO(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          System.out.println(i + " " + j);
          return true;
        }

      }
    }

    return false;
  }

  public static void main(String[] args) {
    int[] arr = { 4, 5, 4, 6 };

    boolean result = repeatNO(arr);
    System.out.println(result);

  }
}
