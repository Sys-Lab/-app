package com.lyf;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class lyf {
public static void main(String[] args) throws UnknownHostException{
	InetAddress address=InetAddress.getLocalHost();
	System.out.println("计算机名： "+address.getHostName());
	System.out.println("ip:"+address.getHostAddress());
	byte[] bytes=address.getAddress();
	System.out.println(address);
	InetAddress address2=InetAddress.getByName("李一凡");
	System.out.println("计算机名： "+address2.getHostName());
	System.out.println("ip:"+address2.getHostAddress());
	InetAddress.getAllByName("192.168.1.106");
}
}
