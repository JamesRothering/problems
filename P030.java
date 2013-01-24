//question: how does finally get executed when a catch block has a return statement?
public class P030
{
  public static void main(String[] argv)
  {
    P030 aTest = new P030();
    System.out.println("main: got a return value of " + aTest.seeWhatHappens() );
  }//end-main

  public int seeWhatHappens()
  {
    try
    {
      P030.causeError();
    }//end-try
    catch(Exception e)
    {
      System.out.println("catch: First we do the exception handling");
      int aRetVal = 3;
      System.out.println("catch: Then we set the return value to 3");
      return aRetVal;
    }//end-catch-block
    finally
    {
       System.out.println("finally: ...But before we actually execute the return" +
                           " we do the finally processing");

    }//end-finally
    int aNum =1;
    return (aNum);
   }//end-method seeWhatHappens
 

  public static void causeError() 
  {
    int aNum = 3/0;
  }
  

}
