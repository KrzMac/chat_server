import java.io.IOException;

/**
 * Created by KMacioszek on 2016-03-17.
 */
public class main {

    public static void main(String args[]) throws IOException {
        if (args.length != 1)
            throw new RuntimeException ("Syntax: ChatServer <port>");
        new ChatServer (Integer.parseInt (args[0]));
    }

}
