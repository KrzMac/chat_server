import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by KMacioszek on 2016-03-17.
 */
public class ChatServer {

    public ChatServer(int port) throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        while (true) {
            Socket client = serverSocket.accept();
            System.out.println("Accepted from " + client.getInetAddress());
            ChatHandler chatHandler = new ChatHandler(client);
            chatHandler.start();
        }
    }

}
