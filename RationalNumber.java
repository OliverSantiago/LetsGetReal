public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    if (denominator == 0 && numerator == 1){
      denominator = 1;
      numerator = 0;
    }
    numerator=nume;
    denominator=deno;
    reduce();
  }

  public double getValue(){
    double answer = ((double)numerator)/((double)denominator);
    //printing out numerator and denominator seperately gives the right answer
    //but this method always returns 0
    return (answer);
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber answer = new RationalNumber(denominator,numerator);
    return answer;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    if (denominator == other.getDenominator()&&numerator == other.getNumerator()){
      return true;
    }
    return false;
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    String snum = String.valueOf(numerator);
    String sden = String.valueOf(denominator);
    return snum+"/"+sden;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    //http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    int answer = 1;
    for (int i = 1; i <= Math.min(a,b); i++){
      if (a%i==0&&b%i==0){
        if (i>answer){
          answer = i;
        }
      }
    }
    return answer;
  }

  public int gcdtester(){
    reduce();
    return(0);
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int g = gcd(numerator,denominator);
    numerator = numerator/g;
    denominator = denominator/g;
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    int answern = numerator * other.getNumerator();
    int answerd = denominator * other.getDenominator();
    RationalNumber answer = new RationalNumber(answern, answerd);
    return answer;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    RationalNumber N = other.reciprocal();
    return multiply(N);
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int m = denominator*other.getDenominator();
    System.out.println(m);
    int answern = (numerator*(m/denominator))+(other.getNumerator()*(m/other.getDenominator()));
    RationalNumber answer = new RationalNumber(answern, m);
    return answer;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int m = denominator*other.getDenominator();
    System.out.println(m);
    int answern = (numerator*(m/denominator))-(other.getNumerator()*(m/other.getDenominator()));
    RationalNumber answer = new RationalNumber(answern, m);
    return answer;
  }
}
