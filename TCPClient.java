import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) throws Exception {
        // 服务器IP地址和端口号
        String serverAddress = "127.0.0.1";
        int serverPort = 8000;

        // 创建客户端Socket并连接服务器
        Socket clientSocket = new Socket(serverAddress, serverPort);

        OutputStream outToServer = clientSocket.getOutputStream();
        DataOutputStream out = new DataOutputStream(outToServer);
        out.writeUTF("I'm fine!");

        InputStream inFromServer = clientSocket.getInputStream();
        DataInputStream in = new DataInputStream(inFromServer);
        System.out.println("Server response: " + in.readUTF());

        clientSocket.close();
    }
}
