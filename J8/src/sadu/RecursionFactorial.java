package sadu;

public class RecursionFactorial {
  public static void main(String[] args) {
    int n = 5;
    int output = fact(n);
    System.out.println(output);
  }

  private static int fact(int n) {
    if (n <= 1) {
      return 1;
    }
    return n * fact(n - 1);
  }
}
