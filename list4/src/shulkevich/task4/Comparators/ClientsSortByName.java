package shulkevich.task4.Comparators;

import java.util.Comparator;

import shulkevich.task4.Entity.Client;

public class ClientsSortByName implements Comparator<Client> {

	@Override
	public int compare(Client o1, Client o2) {
		if(o1 == null || o2 == null) return 0;
		return o1.getName().compareTo(o2.getName());
	}
}
