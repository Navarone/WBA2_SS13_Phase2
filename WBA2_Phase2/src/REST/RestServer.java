package REST;

import java.io.IOException;
import java.util.Scanner;

import com.sun.grizzly.http.SelectorThread;
import com.sun.jersey.api.container.grizzly.GrizzlyServerFactory;

public class RestServer {

	public static void main(String[] args) throws IllegalArgumentException,IOException {
		String url = "http://localhost:4434";
		
		SelectorThread srv = GrizzlyServerFactory.create(url);
		System.out.println("Server gestartet ... [ENTER]");
		(new Scanner(System.in)).nextLine();
		
		srv.stopEndpoint();
	}
	
}
