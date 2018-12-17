package shulkevich.task4.Service;

import java.io.FileNotFoundException;
import java.util.List;

import shulkevich.task4.Comparators.ClientsSortByName;
import shulkevich.task4.Entity.Client;
import shulkevich.task4.Storage.ClientStorage;
import shulkevich.task4.Utils.Parser;
import shulkevich.task4.Utils.Worker;


public class ClientService {

	private ClientStorage clientsRep = ClientStorage.getInstance();
		
	public void addClient(Client client) {
		clientsRep.create(client);
	}
	
	public void read(String path) throws FileNotFoundException {
		String[] data = Worker.readAll(path);
		for (int i = 0; i < data.length; i++) {
			clientsRep.create(Parser.parseClient(data[i]));
		}
	}
	
	public void write(String path) throws FileNotFoundException {
		Worker.writeAll(clientsRep.toFile(), path);
	}
	
	public List<Client> getClients() {
		return clientsRep.getClients();
	}
	
	public Client getClient(Integer id) {
		return clientsRep.read(id);
	}
	
	public Client getClientByName(String name) {
		return clientsRep.getClientByName(name);
	}
	
	public void sortByName() {
		clientsRep.sort(new ClientsSortByName());
	}
	
}
