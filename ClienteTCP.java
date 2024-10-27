//package redes.tcp 

import java.io.*;
import java.net.Socket;


public class ClienteTCP{
    private static int PORTA = 12345;
    private static String IP = "localhost"; //127.0.0.1 
    
		public static void main(String[] args0){
			try{
				Socket socket = new Socket(IP, PORTA);
				System.out.println("Conectado com "+socket.getInetAddress().getHostAddress());
				byte[] buffer = "ping".getBytes();
				OutputStream out = socket.getOutputStream();
				out.write(buffer);
				
				
				InputStream in = socket.getInputStream();
				int bytesLidos = in.read(buffer);
				
				System.out.println(bytesLidos +": ECHO -> "+new String(buffer));
				
				socket.close();
				
			}catch(IOException e){
				e.printStackTrace();
		}
	}
}
