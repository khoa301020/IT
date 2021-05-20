package Multichat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ClientExample {
    private InetAddress host;
    private int port;

    public ClientExample(InetAddress host, int port) {
        this.host = host;
        this.port = port;
    }
    private void execute() throws IOException {
        //Tạo Socket
        DatagramSocket client = new DatagramSocket();

        //Phần bổ sung
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào tên của bạn: ");
        String name = sc.nextLine();
        client.send(createPacket(name + " đã tham gia vào phòng chat!"));

        ReadClient read = new ReadClient(client);
        read.start();
        WriteClient write = new WriteClient(client, host, port, name);
        write.start();
    }

    public static void main(String[] args) throws IOException {
        ClientExample client = new ClientExample(InetAddress.getLocalHost(), 15797);
        client.execute();
    }

    private DatagramPacket createPacket(String value) {
        byte[] arrData = value.getBytes();
        return new DatagramPacket(arrData, arrData.length, host, port);
    }
}

class ReadClient extends Thread{
    private DatagramSocket client;

    public ReadClient(DatagramSocket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            while(true) {
                String sms = receiveData(client);
                System.out.println(sms);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    private String receiveData(DatagramSocket client) throws IOException {
        byte[] temp = new byte[1024];
        DatagramPacket receive_Packet = new DatagramPacket(temp, temp.length);
        client.receive(receive_Packet);
        return new String(receive_Packet.getData()).trim();
    }
}

class WriteClient extends Thread{
    private DatagramSocket client;
    private InetAddress host;
    private int port;
    private String name;

    public WriteClient(DatagramSocket client, InetAddress host, int port, String name) {
        this.client = client;
        this.host = host;
        this.port = port;
        this.name = name;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                String sms = sc.nextLine();
                DatagramPacket DP = createPacket(name + ": " + sms);	//Đóng gói chuẩn bị gửi đi
                client.send(DP);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    private DatagramPacket createPacket(String value) {
        byte[] arrData = value.getBytes();
        return new DatagramPacket(arrData, arrData.length, host, port);
    }
}