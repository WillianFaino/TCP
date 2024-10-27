//package redes.tcp


import java.io.*;
import java.net.*;



public class ServerTCP{
	public static int PORTA = 12345;
	
	public static void main(String[] args){
		InputStream in;	
		try{
			ServerSocket server = new ServerSocket(PORTA);
			while(true){
				System.out.println("Aguardando Conexão...");
				Socket socket = server.accept();
				System.out.println("Conectado com "+socket.getInetAddress().getHostAddress());
				
				byte[] buffer = new byte[1024];
				in = socket.getInputStream();
				int bytesLidos = in.read(buffer);
				String lido = new String(buffer);
				
				System.out.println(bytesLidos +": "+lido);
				
				OutputStream out = socket.getOutputStream();
				out.write(lido.toUpperCase().getBytes());
				
				//socket.close();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

