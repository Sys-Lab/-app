package com.lyf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class serverthread extends Thread {
Socket socket=null;
public serverthread(Socket socket){
	this.socket=socket;
}
public void run(){
	InputStream is;
	try {
		is = socket.getInputStream();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	InputStreamReader isr=new InputStreamReader(is);
	BufferedReader br=new BufferedReader(isr);
	String info=null;
	try {
		while((info=br.readLine())!=null){
			System.out.println(" "+info);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		socket.shutdownInput();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		InputStream a=socket.getInputStream();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	OutputStream os = null;
	try {
		os = socket.getOutputStream();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	PrintWriter pw=new PrintWriter(os);
	pw.write("»¶Ó­£¡");
	pw.flush();

}
