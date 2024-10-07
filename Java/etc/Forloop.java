package Java.etc;

public class Forloop {
  public static void main(String[] args) {
    System.out.println("This is an example of a for loop. ");
    String arbitraryString = "Arbitrary String";
    for (int i = 0; i < arbitraryString.length(); i++) {
      System.out.println(arbitraryString.charAt(i));
    }
  }
}
