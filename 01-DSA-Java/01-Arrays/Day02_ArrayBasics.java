// Array thinking rule:
/*
  ❌ Think in values
  ✅ Think in indexes

  Array =
  Index: 0  1  2  3
  Value:10 20 30 40
*/

public class Day02_ArrayBasics {
  // Given an array, print all elements.
  /*
   * 🧠 THINK FIRST
   * - Where does array start? → index 0
   * - Where does it end? → length - 1
   */
  /*
   * LOGIC:
   * - Loop from index 0
   * - Loop until index < length of array
   * - Print element at index
   */
  public static void printArr(int[] arr) {
    // Arrays are zero-indexed, so I start from 0 and go till length-1.
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  // Find the maximum number in an array.
  /*
   * 🧠 THINK (THIS IS IMPORTANT)
   * - Assume first element is max
   * - Compare with remaining elements
   * - Update max if needed
   */
  /*
   * LOGIC:
   * - Initialize first element as max variable
   * - Loop from index 1
   * - If current element > max -> update max
   */
  public static void findMax(int[] arr) {
    int max = arr[0]; // Assuming first element is max
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i]; // Update max
      }
    }
    System.out.println(max);
  }

  public static void main(String[] args) {
    int[] numbers = { 10, 20, 30, 40, 50 };
    // System.out.println("Array elements are:");
    // printArr(numbers);

    System.out.println("Maximum number in the array is:");
    findMax(numbers);
  }
}
