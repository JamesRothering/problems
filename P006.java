//Question: In the method parameters, is this an example of covariance
//          or contravariance?
//     and: Does it compile?
//     and: is it an override or an overload?
public class P006
{
  public static void main(String[] argv)
  {
     String aString = "test";
   System.out.println("got a string created = " + aString);
   Parent aParent = new Parent();
   Child  aChild  = new Child();

   aParent.doSomething(aString);

   aChild.doSomething("test");
   aChild.doSomething(new Object() );

  }//end-main
}//end-class P006


class Parent
{
  void doSomething(String aParm)
  {
    System.out.println("invoked doSomething from Parent");
  }
}


class Child extends Parent
{
  void doSomething(Object aParm)
  {
    System.out.println("invoked doSomething from Child");
  }
}




















//Answer: It is an example of contravariance in the method parameters
//    and contravariance is not supported in Java. It will compile, but
//    the Child class will have two methods named doSomething! One, inherited
//    from the parent, and another overloaded method from the child class.
//    Another way of saying this is that there is no overriding of the
//    doSomething class, because the method parameters are contravariants.
//    
