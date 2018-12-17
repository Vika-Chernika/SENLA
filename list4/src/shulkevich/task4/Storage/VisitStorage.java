package shulkevich.task4.Storage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import shulkevich.task4.Entity.Client;
import shulkevich.task4.Entity.Room;
import shulkevich.task4.Entity.Visit;
import shulkevich.task4.Interfaces.EntityRepos.IVisitRepository;
import shulkevich.task4.Utils.IdGenerator;

public class VisitStorage implements IVisitRepository {
		
		private List<Visit> visits = new ArrayList<Visit>();
		private static int visitId = 0;
		private static VisitStorage instance;
		
		private VisitStorage() {
			
		}
		
		public static VisitStorage getInstance() {
			if (instance == null)
				instance = new VisitStorage();
			return instance;
		}
		public List<Visit> getVisits() {
			return visits;
		}

		@Override
		public void create(Visit visit) {
			visitId = IdGenerator.generateId(visitId);
			visit.setId(visitId);
			visits.add(visit);
		}
		
		@Override
		public Visit read(Integer id) {
			for (Visit visit : visits) {
				if(visit.getId() == id) {
					return visit;
				}
			}
			return null;
		}
		
		@Override
		public void update(Visit item) {
			for (Visit visit : visits) {
				if(visit.getId() == item.getId()) {
					visit = item;
					break;
				}
			}
		}

		@Override
		public void delete(Integer id) {
			visits.remove(read(id));
		}
		
		public void create(Date startDate, Date endDate, Room room, Client client) {
			visitId = IdGenerator.generateId(visitId);
			visits.add(new Visit(startDate, endDate, room, client, visitId));
		}
		
		public List<Visit> getVisits(boolean fl) {     //current visits
			List<Visit> temp = new ArrayList<Visit>();
			for (Visit visit : visits) {
				if(visit.getEndDate().compareTo(new Date()) > 0 && visit.getStartDate().compareTo(new Date()) < 0) {
					temp.add(visit);
				}			
			}
			return temp;
		}
		
		public List<Visit> getVisits(Date date) {
			List<Visit> temp = new ArrayList<Visit>();
			for (Visit visit : visits) {
				if(visit.getEndDate().compareTo(date) > 0) {
					temp.add(visit);
				}			
			}
			return temp;
		}
		
		public List<Visit> getVisits(Room room, int number) {
			List<Visit> temp = new ArrayList<Visit>(number);
			for (Visit visit : visits) {
				if(visit.getRoom().getNumber() == room.getNumber() && number > 0)
				{
					temp.add(visit);
					number -= 1;
				}
			}
			return temp;
		}
		
		public int getCurrentClientsCount() {
			return getVisits(true).size();
		}

		public Visit getLastVisitByClient(Client client) {
			for (Visit visit : visits) {
				if(visit.getClient().getName().compareTo(client.getName()) == 0)
					return visit;
			}
			return null;
		}
		
		public String[] toFile() {
			List<String> res = new ArrayList<String>();
			for (Visit visit : visits) {
				res.add(visit.toString());
			}
			return (String[]) res.toArray(new String[res.size()]);
		}


		public void sort(Comparator<Visit> comparator) {
			visits.sort(comparator);
		}
}
