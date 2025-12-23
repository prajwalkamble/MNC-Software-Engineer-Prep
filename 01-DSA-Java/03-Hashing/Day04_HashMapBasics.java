/*
  🔑 HASHMAP THINKING RULE
    ❌ Count manually
    ✅ Store counts in map

  HashMap stores:
    key   → value
    char  → frequency
    num   → count
*/

import java.util.HashMap;

public class Day04_HashMapBasics {

  // Given an array, print duplicate elements.
  /*
   * 🧠 THINK
   * - If number appears again → duplicate
   * - Use HashMap to count
   */
  /*
   * LOGIC:
   * - Create empty HashMap<Integer, Integer>
   * - Loop array
   * - If number in map → increment count
   * - Else → add number with count 1
   * - Print elements with count > 1
   */

  public static void printDuplicates(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : arr) {
      if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
      } else {
        map.put(num, 1);
      }
    }
    System.out.println("Duplicate elements:");
    for (int key : map.keySet()) {
      if (map.get(key) > 1) {
        System.out.println(key + " appears " + map.get(key) + " times.");
      }
    }
  }
  // HashMap allows O(1) average lookup for frequency counting.

  // Given a string, find the first non-repeating character.
  /*
   * 🧠 THINK
   * - First count frequencies
   * - Then scan again to find first with count = 1
   */
  /*
   * LOGIC:
   * - Create HashMap<Character, Integer>
   * - Loop through string to count frequencies
   * - Loop through string again to find first char with frequency 1
   */
  public static char firstNonRepeatingChar(String str) {
    HashMap<Character, Integer> freqMap = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      freqMap.put(ch, freqMap.getOrDefault(freqMap, null) == null ? 1 : freqMap.get(ch) + 1);
    }

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (freqMap.get(ch) == 1) {
        return ch;
      }
    }
    return '\0'; // Return null character if none found
  }

  public static void main(String[] args) {
    // int arr[] = { 1, 2, 3, 4, 5, 3, 2, 1, 4, 5, 6, 7, 8, 9, 8, 7, 9, 10 };
    // printDuplicates(arr);

    String str = "leetcode";
    char result = firstNonRepeatingChar(str);
    if (result != '\0') {
      System.out.println("First non-repeating character: " + result);
    } else {
      System.out.println("No non-repeating character found.");
    }
  }
}
