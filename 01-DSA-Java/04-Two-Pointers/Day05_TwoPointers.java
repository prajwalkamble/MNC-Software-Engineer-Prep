/*
  🔑 TWO POINTERS RULE (INTERVIEW GOLD)
    ❌ Nested loops
    ✅ Move pointers smartly

    Used when:
      - Array is sorted
      - You compare from both ends
      - You want O(N) instead of O(N²)
*/

public class Day05_TwoPointers {
  // Reverse an array without using extra space.
  /*
   * 🧠 THINK
   * - One pointer at start
   * - One pointer at end
   * - Swap & move inward
   */
  /*
   * LOGIC:
   * - Initialize 2 pointers, left -> start (0), right -> end (length - 1)
   * - While left < right:
   * - Swap left & right elements
   * - Move left (left++) & right (right--)
   * - Return the modified array
   */
  public static int[] reverseArray(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
      // Swap
      arr[left] = arr[left] + arr[right];
      arr[right] = arr[left] - arr[right];
      arr[left] = arr[left] - arr[right];

      // Move pointers
      left++;
      right--;
    }
    return arr;
  }

  // Given sorted array & target, check if pair exists (two sum problem - sorted
  // array).
  /*
   * 🧠 THINK
   * - Sum too small → move left
   * - Sum too large → move right
   */
  /*
   * LOGIC:
   * - Initialize 2 pointers, left -> start (0), right -> end (len - 1)
   * - While left < right:
   * - Calculate sum = arr[left] + arr[right]
   * - If sum == target, return true
   * - If sum < target, left++
   * - If sum > target, right--
   * - Return false if no pair found
   */
  // Time Complexity: O(N)
  // Space Complexity: O(1)
  public static void twoSumSorted(int arr[], int target) {
    int left = 0, right = arr.length - 1;
    while (left < right) {
      int sum = arr[left] + arr[right];
      if (sum == target) {
        System.out.println("\n\nPair found: " + arr[left] + " " + arr[right]);
        return;
      } else if (sum < target) {
        left++;
      } else {
        right--;
      }
    }
    if (left >= right) {
      System.out.println("\n\nNo pair found!!!");
    }
  }
  // Two pointers reduce time from O(N²) to O(N).

  public static void main(String[] args) {
    // Reverse Array
    int[] arr = { 1, 2, 3, 4, 5, 6 };
    int[] reversedArr = reverseArray(arr);
    // Print reversed arr
    System.out.println("Reversed Array:");
    for (int num : reversedArr) {
      System.out.print(num + " ");
    }

    // Two Sum in Sorted Array
    int[] sortedArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int target = 10;
    twoSumSorted(sortedArr, target);
  }
}
