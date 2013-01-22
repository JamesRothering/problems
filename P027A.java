public class P027A
{
  P027A aObject = new P027A();
  public static void main (String[] argv)
  {}
}//end-class P027A

class Child extends P027A
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

