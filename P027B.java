public class P027B
{
  P027B aObject = new P027B();
  public static void main (String[] argv)
  {}
}//end-class P027B

final class Child extends P027B
{
  void aMethod()
  {
    System.out.println("the child class aMethod invoked.");
  }
}

class GrandChild extends Child
{
  void aMethod()
  {
    System.out.println("the grandchild class aMethod overrides the Child");
  }
}

