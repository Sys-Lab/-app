package com.lyf;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
public class url1 {
public static void main(String [] args){
	try {
		URL url=new URL("http://www.baidu.com");
		InputStream is=url.openStream();
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);
		String data =br.readLine();
		while(data!=null){
			System.out.println(data);
			data=br.readLine();
		}
		br.close();
		isr.close();
		is.close();
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
