public class AccessingElements {
  public static void main(String args[]) {
    int[] counts = new int[4];
    
    counts[0] = 7;
    counts[1] = counts[0] * 2;
    counts[2]++;
    counts[3] -= 60;
    
    int i = 0;
    while (i < 4) {
        System.out.println(counts[i]);
        i++;
    }

  }
}