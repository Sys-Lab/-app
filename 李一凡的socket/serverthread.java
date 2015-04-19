package com.lyf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/*服务器线程*/
public class ServerThread extends Thread {
Socket socket=null;
public  ServerThread(Socket socket){
	this.socket=socket;
}
public void run(){
	InputStream is = null;
	InputStreamReader isr=null;
	BufferedReader br=null;
	OutputStream os=null;
	PrintWriter pw=null;
	try {
		is = socket.getInputStream();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 isr=new InputStreamReader(is);
	 br=new BufferedReader(isr);
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
		os = socket.getOutputStream();
 pw=new PrintWriter(os);
		pw.write("欢迎");
		pw.flush();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		if(pw!=null)
			pw.close();
		if(os!=null)
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(br!=null)
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(isr!=null)
			try {
				isr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(is!=null)
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(socket!=null)
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
}
}
