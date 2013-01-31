//Question: will the following compile?
//if so, Will it run?
//if so, what will be the output?
public class P050
{
   public static void main(String[] argv)
   {
     P050_Server a_Server = new P050_Server();
     System.out.println("instantiated a Server");
     P050_Client a_Client =  new P050_Client(a_Server);
     System.out.println("instantiated a Client linked to a Server");
     P050_Client a_Client2 = new P050_Client(null);
     System.out.println("instantiated a Client with no Server");
   }
}

class P050_Server {}

class P050_Client
{
  private P050_Server _a_Server = null;

  P050_Client(P050_Server aServer) throws ServerExistenceException
  {
    if (null == aServer) {throw new ServerExistenceException();}
    this._a_Server = aServer;
  }
}

class ServerExistenceException
  extends RuntimeException
{
  ServerExistenceException()
  {
    super("null passed into attempted creation of a Client. Client must have a server");
  }
}




//Answer: will compile
//Principle: constructors may throw exceptions, even if they are not
//          checked exceptions. But a subclass of runtime exception
//          is not required to be declared. (as in this case)
