package server;

import javax.xml.ws.Endpoint;

import service.BankService;

public class ServerJWS {

	public static void main(String[] args) {
		
		String url= "http://localhost:8996/";
		Endpoint.publish(url, new BankService());
		System.out.println(url); 
	}
}
