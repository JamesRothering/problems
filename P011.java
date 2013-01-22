//Question: does  Autoboxing automatically work with a boolean comparison? 
public class P011
{
  public static void main(String[] argv)
  {
    Integer aInt = new Integer(5);
    if(aInt=0)
    {
      System.out.println("autoboxed  a literal of zero into an Integer and assigned it to aInt");
    }//end-then

    Integer aInt2 = new Integer(7);
    if (aInt2==0)
    {
      System.out.println("do you get here?");
    }//end
  }//end-main
}//end-class P011

























//Answer: no, the compiler gives an error that these are incompatible types, on the assignment.
//        on the object equality operator, there is no equality because 0 gets autoboxed to a different Integer object.
