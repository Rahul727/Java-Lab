package SocketProgramming;

import java.io.*;
import java.net.*;

public class TCP_Client {
    public static void main(String[] args) throws UnknownHostException, IOException {
        // create the client and send connection request to server at port 9000
        Socket s = new Socket("localhost" , 9000);

        String msg = "Hello";
         // create outputstream to send data to server
        OutputStream os = s.getOutputStream();

        // create writer to send data
        PrintWriter pout = new PrintWriter(os);

        // send the data
        pout.println(msg);
        pout.flush();

        System.out.println("\t\tMessage sent to server : "+msg);

         // create inputstream to read data from socket
        InputStream is = s.getInputStream();

          // create reader to read data
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("***********************************************************");
        // read the data from the server and print it
        System.out.println("\tEcho from server :"+br.readLine());

        s.close();
    }
}
