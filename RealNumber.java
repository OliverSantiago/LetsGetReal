public class RealNumber extends Number{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }
  //---------ONLY EDIT BELOW THIS LINE------------

  /*
  *Return true when the values are within 0.001% of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  // public boolean equals(RealNumber other1){
  //   double other = other1.getValue();
  //   RealNumber zero = new RealNumber(0.0);
  //   if (value == 0.0){
  //      return (other==0.0);
  //   }
  //   double temp = (Math.abs(value-other))/((value+other)/2)*100;
  //   return (temp<0.001);
  // }

  /*
  *Return a new RealNumber that has the value of:
  *the sum of this and the other
  */
  public RealNumber add(RealNumber other){
     //other can be ANY RealNumber, including a RationalNumber
     //or other subclasses of RealNumber (that aren't written yet)
    double other1 = other.getValue();
    RealNumber answer = new RealNumber(value+other1);
    return answer;
  }

  /*
  *Return a new RealNumber that has the value of:
  *the product of this and the other
  */
  public RealNumber multiply(RealNumber other){
    double other1 = other.getValue();
    RealNumber answer = new RealNumber(value*other1);
    return answer;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this divided by the other
  */
  public RealNumber divide(RealNumber other){
    double other1 = other.getValue();
    RealNumber answer = new RealNumber(value/other1);
    return answer;
  }

  /*
  *Return a new RealNumber that has the value of:
  *this minus the other
  */
  public RealNumber subtract(RealNumber other){
    double other1 = other.getValue();
    RealNumber answer = new RealNumber(value-other1);
    return answer;
  }
}
