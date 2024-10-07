package Java.etc;

// This class truncates a double to a certain amount of decimal places.
public class Truncate1 {
  public static void main(String[] args) {
    double arbitraryDouble = Math.PI;
    int numberOfDigits = 8; // breaks down past 8 due to overflow

    int truncator = 1;
    for (int i = 0; i < numberOfDigits; i++) {
      truncator *= 10;
    }

    double roundedDouble = arbitraryDouble;
    roundedDouble *= truncator;
    roundedDouble = (int) roundedDouble; // really just truncates here
    roundedDouble = (double) (roundedDouble / truncator);

    System.out.println(roundedDouble);
  }
}
