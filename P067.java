class P067
{
  public static void main(String[] args)
  {
    int m= -2147483648 ;
    int n=  2147483647 ;

    System.out.println("Min value of an an int in 2s complement:");
    System.out.println("m=" + Integer.toBinaryString(m));
    System.out.println("Max value of an int in 2s complement:");
    System.out.println("n=" + Integer.toBinaryString(n));
    System.out.println("zero value of an int32 in 2s complement:");
    System.out.println(Integer.toBinaryString(0));
    System.out.println("");

    int  i = 70000;
    char c = (char) 70000;
    System.out.println("i=" + Integer.toBinaryString(i) );
    System.out.println("c=" + Integer.toBinaryString(c) );
    System.out.println("c=" + (int)c);
    //i=10001000101110000
    //c=    1000101110000
    //c=4464(decimal)

    int k = 4464;
    System.out.println("c=" +Integer.toBinaryString(k));
    //c=    1000101110000
    //So it matches!
  }
}

//A: so the cast to char truncates the 4 MSD required to represent 70000.
// notice that 
