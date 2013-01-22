//Question: will this compile?
public class P025
{
  public static void main(String[] argv)
  {
    P025 aInstance = new P025();
  }

  private void aMethod()
  {
    System.out.println("entered static method aMethod");
  }
}

class Child extends P025
{
  @Override
  public void aMethod()
  {
    System.out.println("attempting to override a private  method");
  }
}
