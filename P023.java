//Question: will this compile?
public class P023
{
  public static void main(String[] argv)
  {
    P023 aInstance = new P023();
  }

  static void aMethod()
  {
    System.out.println("entered static method aMethod");
  }
}

class Child extends P023
{
//  @Override
  static void aMethod()
  {
    System.out.println("overriding a Static method");
  }
}













//Answer: yes, it will compile and even run without error, but do nothing
// I'm not really sure why this typo I entered works? Surely it can't find
