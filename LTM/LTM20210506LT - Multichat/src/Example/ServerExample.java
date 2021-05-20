package Multichat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServerExample {
    private int port;
    private InetAddress clientIP;
    private int clientPort;
    public static Map<DatagramPacket, Integer> listSK;

    public ServerExample(int port) {
        this.port = port;
    }

    private void execute() throws IOException {

        DatagramSocket server = new DatagramSocket(port);
        WriteServer write = new WriteServer(server);
        write.start();
        // Đá Client ra khỏi Room nếu qua 10s
        KickClient kick = new KickClient();
        kick.start();

        System.out.println("Server is listening....");
        while (true) {
            String sms = receiveData(server);
            for (DatagramPacket item : listSK.keySet()) {
                if (!(item.getAddress().equals(clientIP) && item.getPort() == clientPort)) {
                    sendData(sms, server, item.getAddress(), item.getPort());
                }
            }
            System.out.println(sms);
        }
    }

    public static void main(String[] args) throws IOException {
        ServerExample.listSK = new HashMap<DatagramPacket, Integer>();
        ServerExample server = new ServerExample(15797);
        server.execute();
    }

    private String receiveData(DatagramSocket server) throws IOException {
        byte[] temp = new byte[1024];
        DatagramPacket receive_Packet = new DatagramPacket(temp, temp.length);
        server.receive(receive_Packet);
        clientIP = receive_Packet.getAddress();
        clientPort = receive_Packet.getPort();
        checkDuplicate(receive_Packet); // Kiểm tra trùng Packet trong mảng Map
        return new String(receive_Packet.getData()).trim();
    }

    private void checkDuplicate(DatagramPacket packet) {
        for (DatagramPacket item : listSK.keySet()) {
            if (item.getAddress().equals(packet.getAddress()) && item.getPort() == packet.getPort()) {
                listSK.replace(item, 0);
                return; // Tìm thấy trùng thoát ra ngay
            }
        }
        listSK.put(packet, 0);
    }

    private void sendData(String value, DatagramSocket server, InetAddress clientIP, int clientPort)
            throws IOException {
        byte[] temp = new byte[1024];
        temp = value.getBytes();
        DatagramPacket send_result_Packet = new DatagramPacket(temp, temp.length, clientIP, clientPort);
        server.send(send_result_Packet);
    }
}

class WriteServer extends Thread {
    private DatagramSocket server;

    public WriteServer(DatagramSocket server) {
        this.server = server;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String sms = sc.nextLine();
            try {
                for (DatagramPacket item : ServerExample.listSK.keySet()) {
                    sendData("Server: " + sms, server, item.getAddress(), item.getPort());
                }
            } catch (Exception e) {
            }
        }
    }

    private void sendData(String value, DatagramSocket server, InetAddress clientIP, int clientPort)
            throws IOException {
        byte[] temp = new byte[1024];
        temp = value.getBytes();
        DatagramPacket send_result_Packet = new DatagramPacket(temp, temp.length, clientIP, clientPort);
        server.send(send_result_Packet);
    }
}

class KickClient extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                for (Map.Entry<DatagramPacket, Integer> item : ServerExample.listSK.entrySet()) {
                    int timeExist = item.getValue();
                    if (timeExist > 15) {
                        ServerExample.listSK.remove(item.getKey());
                        System.out.println("Đã ngắt kết nối với " + item.getKey());
                    } else {
                        ServerExample.listSK.replace(item.getKey(), timeExist + 1);
                    }
                }
                Thread.sleep(1000);
            } catch (Exception e) {
                //To do something
            }
        }
    }
}