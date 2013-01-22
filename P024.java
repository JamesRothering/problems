//Question: will this compile?
public class P024
{
  public static void main(String[] argv)
  {
    P024 aInstance = new P024();
  }

  static void aMethod()
  {
    System.out.println("entered static method aMethod");
  }
}

class Child extends P024
{
  @Override
  void aMethod()
  {
    System.out.println("overriding a Static method");
  }
}
