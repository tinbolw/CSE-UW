package Java.etc;

public class Truncate2 {
  public static void main(String[] args) {
    double arbitraryDouble = Math.PI;
    int numberOfDigits = 3;

    String doubleString = arbitraryDouble + "";
    doubleString = doubleString.substring(0, 2 + numberOfDigits);
    // Works if there is a way to cast String to double
    System.out.println(doubleString);
  }
}
