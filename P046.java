//Question: will this compile
import java.io.IOException;
public class P046
{
  public void doStuff(int y, String s) {}
  public void moreThings(int x) {}
}

class Bar extends P046
{
   public void doStuff(int y, long s) throws IOException {}
}
