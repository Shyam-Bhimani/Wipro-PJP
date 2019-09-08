class Calculator{
    static double power1;
    static double power2;
    static double powerInt(int num1,int num2)
    {
        power1=Math.pow(num1,num2);
        return power1;
    }
   static double powerDouble(double num3,int num4)
    {
        power2=Math.pow(num3,num4);
        return power2;
    }

  public static void main(String[] args) {
  double p1=Calculator.powerInt(2,5);
  double p2=Calculator.powerDouble(2.5,3);
  System.out.println("The result of pwerInt:"+p1);
  System.out.println("The result of pwerDouble:"+p2);
 }  
 
}