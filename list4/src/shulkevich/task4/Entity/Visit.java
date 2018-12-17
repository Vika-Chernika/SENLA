package shulkevich.task4.Entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Visit {

		private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		private Room room;
		private Client client;
		private Date startDate;
		private Date endDate;
		private Integer id;
		
		public Visit() {
			
		}
		
		public Visit(Date startDate, Date endDate, Room room, Client client, int id) {
			this.room = room;
			this.client = client;
			this.startDate = startDate;
			this.endDate = endDate;
			this.id = id;
		}
		
		public Room getRoom() {
			return room;
		}
		public void setRoom(Room room) {
			this.room = room;
		}
		public Client getClient() {
			return client;
		}
		public void setClient(Client client) {
			this.client = client;
		}
		public Date getStartDate() {
			return startDate;
		}
		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}
		public Date getEndDate() {
			return endDate;
		}
		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}
		
		public int getId() {
			return id;
		}
		
		public void setId(Integer id) {
			this.id = id;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder = builder.append(client.getName()).append(";"). 
						 append(room.getNumber()).append(";");
			builder = builder.append(formatter.format(startDate)).append(";").append(formatter.format(endDate));
			return builder.toString();
		}
	
}
