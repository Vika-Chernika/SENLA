package shulkevich.task4;

import java.util.Arrays;
import java.util.List;

import shulkevich.task4.Entity.Client;


public class Parser {

	public static Client parseClient(String data) {
		String[] clientData = data.split(";");
		Client client = new Client();
		client.setIdClient(Integer.parseInt(clientData[1]));
		client.setNameClient(clientData[0]);
		return client;
	}
	
	 
}