public class MultiplicationTable {
  public static void main(String args[]) {
    
    for (int x = 1; x <= 10; x++) {
        for (int y = 1; y <= 10; y++) {
            System.out.printf("%4d", x * y);
        }
        System.out.println();
    }
    
  }
}