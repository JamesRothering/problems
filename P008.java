//Question: what is result?

public class  P005
{
  public static void main(String[] argv)
  {
     byte a = 3;
     byte b = 2;
     byte c = a + b;
  }
}





















//Answer: compiler error, "Possible loss of precision".
//  bytes get promoted to int for calculations, but then it atttempts to
//  store it back into the type you declared, which could result in loss
