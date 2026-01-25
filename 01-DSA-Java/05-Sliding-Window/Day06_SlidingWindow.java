/*
  🔑 SLIDING WINDOW RULE (INTERVIEW GOLD)
    ❌ Recalculate again & again
    ✅ Maintain a moving window

  Used when:
    - Subarrays
    - Substrings
    - Contiguous elements
*/

public class Day06_SlidingWindow {
  // Find max sum of any subarray of size k.
  /*
   * 🧠 THINK
   * - First window (sum of first k elements)
   * - Slide window from start to end
   * - Add next element
   * - Remove first element of previous window
   * - Keep track of max sum
   */
  /*
   * LOGIC
   * - Initialize variables for maxSum, windowSum, windowStart, windowEnd, n, k,
   * arr
   * - Calculate sum of first k elements for initial window
   * - Loop from k to n
   * - Update windowSum by adding arr[windowEnd] and subtracting arr[windowStart]
   * - Update maxSum if windowSum is greater
   * - Increment windowStart
   * - Increment windowEnd
   * - Return maxSum
   */
  public static int slidingWindow(int[] arr, int k) {
    int n = arr.length, maxSum = 0, windowSum = 0, windowStart = 0, windowEnd = 0;
    // Calculate sum of first k elements
    for (int i = 0; i < k; i++) {
      windowSum += arr[i];
    }
    maxSum = windowSum;

    // slide the window
    for (windowEnd = k; windowEnd < n; windowEnd++) {
      windowSum += arr[windowEnd] - arr[windowStart];
      maxSum = Math.max(maxSum, windowSum);
      windowStart++;
    }

    return maxSum;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 1, 5, 1, 3, 2 };
    int k = 3;
    System.out.println("Max sum of subarray of size " + k + " is: " + slidingWindow(arr, k));
  }
}
