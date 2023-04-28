import java.util.Arrays;

/**
 * For this challenge, we'll assume the following:
 *
 * 1. Elements are unique
 * 2. There should be at least 2 elements
 * 3. Elements are not ordered in any manner
 */
public class Main {

  /**
   * A naive approach that:
   *
   * 1. Iterates all elements to find the biggest one: O(n)
   * 2. Iterates all elements to find the element bigger than the rest and smaller than the biggest: O(n)
   *
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static int secondBiggestNumberV1(int[] arr) {
    if (arr == null || arr.length < 2) {
      throw new IllegalArgumentException("Invalid input");
    }

    int biggest = Integer.MIN_VALUE;
    int secondBiggest = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > biggest) {
        biggest = arr[i];
      }
    }

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > secondBiggest && arr[i] < biggest) {
        secondBiggest = arr[i];
      }
    }

    return secondBiggest;
  }

  /**
   * A slight optimization could be achieved if we get rid of the second loop from the previous version
   *
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static int secondBiggestNumberV2(int[] arr) {
    if (arr == null || arr.length < 2) {
      throw new IllegalArgumentException("Invalid input");
    }

    int biggest = Integer.MIN_VALUE;
    int secondBiggest = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > biggest) {
        // in case we found a new biggest, the previous one becomes the second biggest
        secondBiggest = biggest;
        biggest = arr[i];
        // if new biggest is not found, check if new second biggest is found
      } else if (arr[i] > secondBiggest) {
        secondBiggest = arr[i];
      }
    }

    return secondBiggest;
  }

  /**
   * Another way (with less code but worst runtime than the previous two versions) to solve this is by sorting the array in ascending order
   * and retrieving the element at position [arr.length - 2], or in descending order and retrieving the element at position [1].
   *
   * Time Complexity: O(n log n)
   * Space Complexity: O(1)
   */
  public static int secondBiggestNumberV3(int[] arr) {
    if (arr == null || arr.length < 2) {
      throw new IllegalArgumentException("Invalid input");
    }

    Arrays.sort(arr);

    return arr[arr.length - 2];
  }
}
