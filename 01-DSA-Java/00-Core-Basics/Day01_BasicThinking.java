public class Day01_BasicThinking {

  // Print numbers from 1 to N.
  // start - 1
  // end - N
  // loop until i <= N
  // i++
  static void printNnos(int N) {
    for (int i = 1; i <= N; i++) {
      System.out.println(i);
    }
  }

  // Find sum of numbers from 1 to N.
  // start - 1
  // end - N
  // loop until i <= N
  // sum = sum + i
  // i++
  static int sumNnos(int N) {
    int sum = 0;
    for (int i = 1; i <= N; i++) {
      sum += i;
    }
    return sum;
  }

  public static void main(String[] args) {
    // printNnos(10);
    System.out.println("Sum of numbers from 1 to N: " + sumNnos(10));
  }
}
