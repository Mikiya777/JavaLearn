import java.net.*;
public class udpSocket {
    public static void main(String[] args) throws Exception {
        int serverPort = 8000;

        // Socket
        DatagramSocket serverSocket = new DatagramSocket(serverPort);

        // 缓冲区
        byte[] receiveData = new byte[1024];

        // DatagramPacket
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        serverSocket.receive(receivePacket);

        String sdpData = new String(receivePacket.getData());
        System.out.println("接收到客户端发送的数据: " + sdpData);
        //DatagramPacket
        InetAddress clientAddress = receivePacket.getAddress();
        int clientPort = receivePacket.getPort();
        byte[] sendData = "OK".getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);

        serverSocket.send(sendPacket);

        serverSocket.close();
    }
}
