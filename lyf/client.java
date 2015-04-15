package com.lyf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class client {
public static void main(String [] args){
	try {
		Socket socket=new Socket("localhost",8888);
		OutputStream os=socket.getOutputStream();
		PrintWriter pw=new PrintWriter(os);
		pw.write("”√ªß√˚lyf;√‹¬Î123");
		pw.flush();
		socket.shutdownOutput();
		InputStream is=socket.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		String info=null;
		while((info=br.readLine())!=null){
			System.out.println(" "+info);
		}
		br.close();
		is.close();
		pw.close();
		os.close();
		socket.close();
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
