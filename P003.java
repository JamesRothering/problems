//Question: Is the commented line valid?
//Answer Q1: it will compile, but fail at runtime with a class cast exception.
//           the compiler assumes that you know what you are doing when you
//           perform the cast, and there is at least some inheritance relationship
//           involved. The compiler let's this slide, because you could have
//           passed in an Object, for instance, which was actually of type
//           Parent, but had been upcast to Object when it was passed as a
//           parameter, but then it get's downcast to a Parent here and works.
//           But you need hedging calls, such as getClass(), to ensure that
//           you don't get a runtime exception, if you mess up.
//Answer Q2: it will not compile, because they are inconvertible types
public class P003
{
  public static void main(String[] argv)
  {
    //Question 1
    Parent aParent = new Parent();
    Child  aChild  = (Child) aParent; //will this statement work?

    //Question 2
//    Miscellaneous aMisc  =  new Miscellaneous(); //no parent-child relationship at all
//    Child  aChild2       = (Child) aMisc; //will this statement work?
  }//end-main
}//end-class P003

class Parent
{
   public void doStuff()
   {
     System.out.println("entered method doStuff of class Parent");
   }//end-method doStuff
}//end-class Parent

class Child extends Parent
{
  public void doChildStuff()
  {
    System.out.println("entered method doChildStuff of class Child");
  }//end-method doChildStuff
}//end-class Child

class Miscellaneous
{
  public void doStuff(int i)
  {
    System.out.println("entered method doStuff of class Miscellaneous");
  }//end-method doStuff
}//end-class Miscellaneous
