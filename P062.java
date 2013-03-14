//Q: will this compile. If not why?
//Q: if not, what simple change will allow it to compile
class P062
{
  public int testIt()
  {
    float f = 32.5f;
    return f;
  }
}

//A: cast the return variable f to an int, thus explicitly accepting
//   the loss of precision:
//           return (int) f;
