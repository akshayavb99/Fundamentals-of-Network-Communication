/* Author: Akshaya Balaji
 * Date: July 29,2019
 * 
 * Reference: https://www.javatpoint.com/socket-programming
 * This program, along with Client_Example.java are used to illustrate connection-oriented network communication between a server and client program
 *This program only lets the client side write to the server side once
 */
import java.io.*;
import java.net.*;
public class Server_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("Serve side on");
			ServerSocket ser_skt=new ServerSocket(6666);
			Socket skt=ser_skt.accept();//establish connection
			DataInputStream dis=new DataInputStream(skt.getInputStream());
			String str=(String)dis.readUTF();
			System.out.println("message= "+str);
			System.out.println("Server side off");
			ser_skt.close();
		}catch(Exception e) {System.out.println(e);}
	}

}
