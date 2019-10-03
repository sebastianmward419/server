import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

  protected static int port = 3000;  
  protected static String indexHTML = "./public/index.html"; 

  public static void main (String[] args) {
    try 
        {
            ServerSocket server = new ServerSocket ();
        }
    catch (IOException err)
        {
            System.out.println (err);
        }
  }

}