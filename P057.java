
public class P057 extends Learnable 
{
   public void doStuff(String s)
   {
     System.out.println("did Stuff");
   }
   public static void main(String[] args) 
   {
     P057 aTest = new P057();
      
   }

}

abstract interface Learnable
{
  public abstract void doStuff(String s);
}
