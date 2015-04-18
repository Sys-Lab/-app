package com.lyf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
public class server {
	public static void main(String[] args){
		try {
			ServerSocket socket=new ServerSocket(8888);
			Socket soc=null;
			while(true){
				 soc=socket.accept();
				ServerThread serverthead=new ServerThread(soc);
				serverthead.start();
				InetAddress address=soc.getInetAddress();
				System.out.println("IP"+address.getHostAddress());
				System.out.println("»¶Ó­£¡  "+" ");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
