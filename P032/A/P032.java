package A;
//this won't compile, becuase the default access is package access
//  and our subclass in another package needs to access it in order
//  to extend it.
//class P032
public class P032
{
  protected int doSomething()
  {
    //int aNum = 5;
    return (5);  
  }
}
