public class P017
{
  final Parent aFinalObjRef = new Parent();

  public static void main(String[] argv)
  {
    P017 aObject = new P017();
         aObject.aFinalObjRef.aInt = 7;

    System.out.println("got a value from the data member :" +
                       aObject.aFinalObjRef.aInt);
  }//end-main
}//end-class P015

class Parent
{
  int aInt = 2;
}
