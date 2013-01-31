//Question: will the following compile?
//if so, Will it run?
//if so, what will be the output?
public class P048
{
   public static void main(String[] argv)
   {
     P048_Server a_Server = new P048_Server();
     System.out.println("instantiated a Server");
     P048_Client a_Client =  new P048_Client(a_Server);
     System.out.println("instantiated a Client linked to a Server");
     P048_Client a_Client2 = new P048_Client(null);
     System.out.println("instantiated a Client with no Server");
   }
}

class P048_Server {}

class P048_Client throws ServerExistenceException
{
  private P048_Server _a_Server = null;

  P048_Client(P048_Server aServer)
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
