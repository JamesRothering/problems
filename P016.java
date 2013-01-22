public class P016
{
  final static Parent aObj = new Parent();

  public static void main(String[] argv)
  {
      
    P016.aObj.aInt = 4;
    System.out.println("got a value from the data member :" + aObj.aInt);
  }//end-main
}//end-class P015

class Parent
{
  int aInt = 2;
}
