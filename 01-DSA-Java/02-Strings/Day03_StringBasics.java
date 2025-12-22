/*
  🔑 STRING THINKING RULE
    ❌ Think in words
    ✅ Think in characters + indexes

    "level"
    Indexes: 0 1 2 3 4
*/

public class Day03_StringBasics {

  // Check if a string reads the same forwards and backwards.
  /*
   * 🧠 THINK FIRST
   * Compare first and last character
   * Move inward
   * Stop when pointers cross
   */
  /*
   * LOGIC:
   * - Initialize 2 pointers: left = 0, right = str.length() - 1
   * - While left < right:
   * - If char at left != char at right => not a palindrome
   * - Move left pointer to right (left++) and right pointer to left (right--)
   * - If loop completes, its a palindrome
   */
  public static void checkPalindrome(String str) {
    int left = 0;
    int right = str.length() - 1;
    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        System.out.println("Given string is NOT a Palindrome string.");
        return;
      }
      left++;
      right--;
    }
    System.out.println("Given string is a Palindrome string.");
  }

  // Count frequency of each character in a string.
  /*
   * 🧠 THINK
   * - Characters are ASCII
   * - Use array of size 256 (basic approach)
   */
  /*
   * LOGIC:
   * - Create array freqency of size 256 initialized to 0
   * - Loop through each character in string:
   * - Convert character to ASCII value (int)
   * - Increment frequency[ASCII value] by 1
   * - Print frequency array for non-zero values
   */
  public static void countCharFreq(String str1) {
    int[] frequency = new int[256]; // ASCII size

    for (int i = 0; i < str1.length(); i++) {
      char ch = str1.charAt(i);
      frequency[(int) ch]++;
    }
    System.out.println("Character Frequencies:");
    for (int i = 0; i < frequency.length; i++) {
      if (frequency[i] > 0) {
        System.out.println((char) i + ": " + frequency[i] + " times");
      }
    }
  }

  public static void main(String[] args) {
    // String str = "level";
    // checkPalindrome(str);

    String str1 = "lamborghini";
    countCharFreq(str1);
  }
}
