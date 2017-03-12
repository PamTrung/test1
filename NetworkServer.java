package Phan8;
import java.net.*;
import java.io.*;
public abstract class NetworkServer {
	private int port;
	public NetworkServer(int port){
		this.port = port;
	}
	public void listen() throws IOException{
		ServerSocket listener = new ServerSocket(port);
			Socket socket;
			while(true){
				socket = listener.accept();
				handleConnection(socket);
			}
	}
	
	protected abstract void handleConnection(Socket socket)
			throws IOException;
	public int getPort(){
		return(port);
	}
}
