package SocketProgramming;

import java.net.*;
import java.io.*;

public class TCP_Server {
    public static void main(String[] args) throws IOException {
      // create server at port 9000
        ServerSocket ss = new ServerSocket(9000);

      // accept the client if request arrives
        Socket s = ss.accept();

      // create inputstream to read data from socket
        InputStream is = s.getInputStream();

      // create reader to read data
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

      // read the data from socket.
        String msg = br.readLine();

      // create outputstream to echo back the data to client
        OutputStream os = s.getOutputStream();

      // create writer to send data
        PrintWriter pout = new PrintWriter(os);

      // send the data
        pout.println(msg);
        pout.flush();

        s.close();
        ss.close();
    }
}
