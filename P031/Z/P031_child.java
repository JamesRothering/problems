package Z;
import A.*;

//1: class P031_child extends P031
public class P031_child extends P031
{
  int aValue = 3;

  public static void main(String[] argv)
  {
    //won't compile, "error: getValue has protected access" :
//    P031 aParent = new P031();
//    System.out.println("got a value: " + aParent.getValue() );

//  the protected method can be accessed outside of the package
//    only by inheritance
    P031_child aChild = new P031_child();
    System.out.println("got a value from the child: " + aChild.getValue() );

// super is inheritance, wo this is OK:
   P031_child aChild2 = new P031_child();
   System.out.println("got another val from the child: " + aChild2.tryThis() );
  }

  public int tryThis()
  {
    return super.getValue();
  }
}
