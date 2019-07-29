/* Author: Akshaya Balaji
 * Date: July 29,2019
 * Source: https://www.javatpoint.com/socket-programming
 * 
 * This program, along with Server_example.java is meant to illustrate the working of a simple connection-oriented service between a server and client
 * This program only lets the client side write to the server side once
 */
import java.io.*;
import java.net.*;
public class Client_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket skt=new Socket("localhost",6666);
			DataOutputStream dout=new DataOutputStream(skt.getOutputStream());
			dout.writeUTF("Hello Server");
			dout.flush();
			dout.close();
			skt.close();
		}catch(Exception e) {System.out.println(e);}
		

	}

}
