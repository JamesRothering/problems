//Question: Are the return types examples of covariance or contravariance?
//      and: is it valid in Java?
public class P004
{
  public static void main(String[] argv)
  {
  }//end-main
}//end-class P004

class Parent
{
  Object doSomething()
  {
    return new Object();
  }//end-method doSomething
}//end-class Parent

class Child extends Parent
{
  String doSomething()
  {
    return new String("test");
  }//end-method getSomething
}//end-class Child
















//Answer: it is an example of covariant return types and is valid in Java
// as of version 1.5
