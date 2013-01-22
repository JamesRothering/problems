//Question: In the method parameters, is this an example of covariance
//          or contravariance?
//     and: Does it compile?
//     and: is it an override or an overload?
public class P007
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
}//end-class P007

class Parent
{
  void doSomething(Object aParm)
  {
    System.out.println("invoked doSomething from method defined in Parent");
    System.out.println("-- but the runtime class invoked is " + getClass() );
    System.out.println(" ");
  }
}

class Child extends Parent
{
  void doSomething(String aParm)
  {
    System.out.println("invoked doSomething from method defined in Child");
    System.out.println("-- but the runtime class invoked is " + getClass() ); 
    System.out.println("");
  }
}




















//Answer: It is an example of covariance in the method parameters,
//  which is supported in Java, in that it is not a compiler error.
//  but note that method parameters must be invariant for overriding
//  Otherwise, it is a case of overloading and a parallel method definition
//  exists. So the child instances get both methods, one inherited from the
//  superclass and one from the child class. There is no overriding involved,
//  because these are not invariants.
