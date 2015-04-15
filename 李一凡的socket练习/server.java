package com.lyf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class server {
	public static void main(String[] args){
		try {
			ServerSocket socket=new ServerSocket(8888);
			socket.accept();
			Socket soc=socket.accept();
			InputStream is=soc.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			String info=null;
			while((info=br.readLine())!=null){
				System.out.println(" "+info);
			}
			soc.shutdownInput();
			InputStream a=soc.getInputStream();
			OutputStream os=soc.getOutputStream();
			PrintWriter pw=new PrintWriter(os);
			pw.write("»¶Ó­£¡");
			pw.flush();
			pw.close();
			os.close();
			br.close();
			isr.close();
			is.close();
			soc.close();
			socket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
