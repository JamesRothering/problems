public class P015
{
  final static  Parent aObj = new Parent();

  public static void main(String[] argv)
  {
//this line seems to be invalid, because it's a static ref.
//    this.aObj.aInt = 4;
    System.out.println("got a value from the data member :" + aObj.aInt);
  }//end-main
}//end-class P015

class Parent
{
  int aInt = 2;
}
