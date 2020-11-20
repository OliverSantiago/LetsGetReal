public class Tester{
  public static void main(String[]args){
    RealNumber test = new RealNumber(3.0);
    RealNumber test2 = new RealNumber(5.0);


    System.out.println(test.equals(test2));
    System.out.println(test.add(test2));
    System.out.println(test.multiply(test2));
    System.out.println(test.divide(test2));
    System.out.println(test.subtract(test2));
  }
}
