public class Return {

  public static double calculateArea(double radius) {
    double result = Math.PI * radius * radius;
    return result;
  }
  
  public static void main(String args[]) {
    double diameter = 10.0;
    double area = calculateArea( diameter / 2 );
  }
  
}