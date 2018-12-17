package shulkevich.task4.Storage;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import shulkevich.task4.Entity.Client;
import shulkevich.task4.Interfaces.EntityRepos.IClientRepository;
import  shulkevich.task4.Utils.IdGenerator;

public class ClientStorage implements IClientRepository {
	
	private List<Client> clients = new ArrayList<Client>(); 
	private static int clientId = 0;
	private static ClientStorage instance;
	
	private ClientStorage() {
		
	}
	
	public static ClientStorage getInstance() {
		if (instance == null)
			instance = new ClientStorage();
		return instance;
	}

	@Override
	public List<Client> getClients() {
		return clients;
	}
	
	@Override
	public void create(Client client) {
		clientId = IdGenerator.generateId(clientId);
		client.setId(clientId);
		clients.add(client);
	}
	
	@Override
	public Client read(Integer id) {
		for (Client client : clients) {
			if(client.getId() == id)
				return client;
		}
		return null;
	}
	
	@Override
	public void update(Client client) {
		for (Client currentClient : clients) {
			if(currentClient.getId() == client.getId()) {
				currentClient.setName(client.getName());
				return;
			}
		}
	}
	
	@Override
	public void delete(Integer id) {
		clients.remove(read(id));
	}
	
	@Override
	public Client getClientByName(String name) {
		for (Client client : clients) {
			if(client.getName().equals(name)) {
				return client;	
			}
		}
		return null;
	}
	
	//posmotret' potom
	public String[] toFile() {
		List<String> res = new ArrayList<>();
		for (Client client : clients) {
			res.add(client.toString());
		}
		return (String[]) res.toArray(new String[res.size()]);
	}
	
	public void sort(Comparator<Client> comparator) {
		clients.sort(comparator);
	}
}
  