import java.net.*; 
import java.io.*; 

public class Server {
    public static void main (String[] args) {
        startServer (3000);
    }

    public static void startServer (int port) {
        try 
            {
                ServerSocket server = new ServerSocket (port);
                
                System.out.println ("Server Started"); 
                System.out.println ("Waiting for client");

                Socket socket = server.accept ();

                System.out.println ("Client Accepted");
            }
        catch (IOException err)
            {
                System.out.println (err);
            }
    }
}