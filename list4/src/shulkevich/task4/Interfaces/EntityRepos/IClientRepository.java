package shulkevich.task4.Interfaces.EntityRepos;

import shulkevich.task4.Interfaces.IRepository;

import java.util.List;

import shulkevich.task4.Entity.Client;

public interface IClientRepository extends IRepository<Client> {
	public List<Client> getClients();
	public Client getClientByName(String name);
}
