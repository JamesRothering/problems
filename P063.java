//Q: Will this compile?
//Q: If so, what will it return?
class P063
{
  public static void main(String[] args)
  {
  }

  public void tryIt(int aVal)
  {
    int aNotherVal = 3;
    return;
  }
}

//A: It will compile
//A2: It won't return anything! It will simply "break" out of the method at
//    the "return" command point.
