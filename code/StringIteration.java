public class StringIteration {
  public static void main(String args[]) {
    
    String fruit = "banana";
      
    for (int i = 0; i < fruit.length(); i++) {
        char letter = fruit.charAt(i);
        System.out.println(letter);
    }
    
  }
}