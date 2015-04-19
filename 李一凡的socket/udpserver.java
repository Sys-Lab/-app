package com.lyf;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class udpserver {
public static void main(String[] args) throws IOException{
	DatagramSocket socket =new DatagramSocket(8800);
	byte[] data=new byte[1024];
	DatagramPacket packet=new DatagramPacket(data,data.length);
	socket.receive(packet);
	String info=new String(data,0,packet.getLength());
	System.out.println("¿Í»§¶ËËµ"+info);
	InetAddress address=packet.getAddress();
	int port=packet.getPort();
	byte[]data2="welcome!".getBytes();
	DatagramPacket packet2=new DatagramPacket(data2,data.length,address,port);
	socket.send(packet2);
	socket.close();
}
}
