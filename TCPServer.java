import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        // 服务器端口号
        int serverPort = 8000;

        // 创建服务器Socket并绑定到指定端口号
        ServerSocket serverSocket = new ServerSocket(serverPort);

        Socket clientSocket = serverSocket.accept();

        InputStream inFromClient = clientSocket.getInputStream();
        DataInputStream in = new DataInputStream(inFromClient);
        System.out.println("Client message: " + in.readUTF());

        OutputStream outToClient = clientSocket.getOutputStream();
        DataOutputStream out = new DataOutputStream(outToClient);
        out.writeUTF("how are you");

        serverSocket.close();
    }
}
