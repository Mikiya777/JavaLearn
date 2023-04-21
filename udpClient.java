import java.net.*;
public class udpClient {
    public static void main(String[] args) throws Exception {
        // 客户端Socket不需要指定端口号
        DatagramSocket clientSocket = new DatagramSocket();

        // 服务器IP地址和端口号
        InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
        int serverPort = 8000;

        byte[] sendData = "客户端发送数据!".getBytes();

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);

        clientSocket.send(sendPacket);

        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        clientSocket.receive(receivePacket);

        String serverResponse = new String(receivePacket.getData());
        System.out.println("Server response: " + serverResponse);

        clientSocket.close();
    }
}
