//swap variababales without a temp var
// stupid I know, but might be on an interview test.
class P059
{
  public static void main(String[] argv)
  {
    int num1 = 10;
    int num2 = 20;
    //swap without a temp var
    num1 = num1 + num2;  //num1=30;num2=20
    num2 = num1 - num2;  //num2=30-20; num1=30
    num1 = num1 - num2;
    System.out.println("num1=" + num1 + " num2= " + num2);
  }
}
