
package echoclientserver;
import java.net.*;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Lala
 */
public class EchoClient {
    public static void main(String[] args){
        System.out.println("Echo Client...");
        try{
            InetAddress localHost = InetAddress.getLocalHost();
            Socket socket = new Socket(localHost,8000);
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            System.out.println ("We are conected to server.");
            Scanner scanner = new Scanner (System.in);
            while (true){
                System.out.println("Please Eenter text :");
                String input = scanner.nextLine();
                if ("Exit".equalsIgnoreCase(input)){
                    break;
                    
                }
                out.println(input);
                String response = buffer.readLine();
                System.out.println("Server response is:"+response);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    
    
}