import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class server{

    private static ServerSocket serverSocket;
    private static Socket clientSocket;
    private static BufferedReader bufferedReader;
    private static String input;

    public static void main(String[] args){

    //Waits for client to connect (port 63400)
    try{

    serverSocket = new ServerSocket(63400);
    clinetSocket = serverSocket.accept();
    //Creates reader
    bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

    //Gets client message
    while ((inputLine = bufferedReader.readLine()) != null)
        System.out.println(inputLine);

    }
    catch(IOException e){
    System.out.println(e);
    }
    }
}
