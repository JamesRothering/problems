//Can you pass a double as an argument to a method parameter defined as float?
public class P029
{
  public static void main(String[] argv)
  {
    P029 aTest = new P029();
    double aDouble = 2.3;
    aTest.aMethod(aDouble); 
  }//end-method main

  public void aMethod(float aNum)
  {
    System.out.println("if this ran, you passed a double to a float");
  }
}
