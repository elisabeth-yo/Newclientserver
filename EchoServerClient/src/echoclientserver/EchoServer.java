
package echoclientserver;
import java.io.*;

import java.net.*;
/**
 *
 * @author Lala
 */
public class EchoServer {
    public static void main (String args[]){
        System.out.println("Echo Server is Started");
        try(ServerSocket echoServer = new ServerSocket(8000)){
            Socket clientSocket= echoServer.accept();
            System.out.println("We are connected to client");
            BufferedReader bufferReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter outPut = new PrintWriter(clientSocket.getOutputStream(),true);
            String line;
            while((line = bufferReader.readLine())!= null){
              System.out.println("On Server :"+line);
              outPut.println(line);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
