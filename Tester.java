public class Tester{
  public static void main(String[]args){
    RealNumber test = new RealNumber(3.0);
    RealNumber test2 = new RealNumber(5.0);
    RationalNumber test3 = new RationalNumber(1,2);
    RationalNumber test4 = new RationalNumber(5,10);
    RationalNumber test5 = new RationalNumber(1,2);

    // System.out.println(test.equals(test2));
    // System.out.println(test.add(test2));
    // System.out.println(test.multiply(test2));
    // System.out.println(test.divide(test2));
    // System.out.println(test.subtract(test2));

    // System.out.println(test3.getNumerator());
    // System.out.println(test3.getDenominator());
    // System.out.println(test3.getValue());

    System.out.println(test3.reciprocal().getValue());
    System.out.println(test3.equals(test4));
    System.out.println(test3.equals(test5));
  }
}
