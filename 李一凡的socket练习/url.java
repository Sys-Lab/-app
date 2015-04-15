package com.lyf;
import java.net.*;
public class url {
public static void main(String[] args){
	try {
		URL wang=new URL("https://github.com/Sys-Lab/-app");
		System.out.println("–≠“È"+wang.getProtocol());
		System.out.println(" "+wang.getHost());
		System.out.println(" "+wang.getPort());
		
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
