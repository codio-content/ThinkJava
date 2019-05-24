public class TraversingArrays {
  public static void main(String args[]) {
    
    int[] a = {1, 2, 3, 4, 5, 6};
    for (int i = 0; 
         i < a.length; 
           i++) {
      a[i] *= a[i];
    }
    
  }
}