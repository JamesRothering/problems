//Question: which method will be invoked at runtime, from class A or B?
public class P001
{
   public static void main(String[] argv)
   {
     A aA = new B();
       aA.aMethod(4);
   }//end-main
}//end-class P001

class A
{
  public void aMethod(int aTest)
  {
    System.out.println("invoked Class A method aMethod");
  }//end-method aMethod
}//end-class A

class B extends A
{
  //overrides the method in class A
  public void aMethod(int aTest)
  {
    System.out.println("invoked the Class B over-riding aMethod");
  }//end-method
}//end-class B
