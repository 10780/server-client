import java.net.Socket;
import java.io.PrintWriter;

public class client{

private static Socket socket;
private static PrintWriter printWriter;

public static void main(String[] args){

try{
socket = new Socket("localhost", 63400);
printWriter = new PrintWriter(socket.getOutputStream(), true);
printWriter.println("Socket...");

}
catch(Exception e){
    System.out.println(e);
}
}

}
