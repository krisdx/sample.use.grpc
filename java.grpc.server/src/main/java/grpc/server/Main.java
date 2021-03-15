package grpc.server;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		JavaGgpcServer server = new JavaGgpcServer();
		server.start();
		
	}
	
}