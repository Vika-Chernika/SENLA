package shulkevich.task4.Utils;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import shulkevich.task4.Entity.Client;
import shulkevich.task4.Entity.Room;
import shulkevich.task4.Entity.Service;
import shulkevich.task4.Entity.Visit;
import shulkevich.task4.Storage.ClientStorage;
import shulkevich.task4.Storage.RoomStorage;

public class Parser {
		

		private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	
		public static Client parseClient(String data) {
			String[] clientData = data.split(";");
			Client client = new Client();
			client.setName(clientData[0]);
			return client;
		}
		
		public static Service parseService(String data) {
			String[] serviceData = data.split(";");
			Service service = new Service();
			service.setName(serviceData[0]);
			service.setPrice(Integer.parseInt(serviceData[1]));
			return service;
		}
		
		public static Room parseRoom(String data) {
			String[] roomData = data.split(";");
			Room room = new Room();
			room.setNumber(Integer.parseInt(roomData[0]));
			room.setPrice(Integer.parseInt(roomData[1]));
			room.setSize(Integer.parseInt(roomData[2]));
			room.setRate(Type.values()[Integer.parseInt(roomData[3])]);
			room.setFree(Boolean.parseBoolean(roomData[4]));
			room.setAvailable(Boolean.parseBoolean(roomData[5]));
			return room;
		}
		
		public static Visit parseVisit(String data){
			String[] temp = data.split(";");
			Client client = ClientStorage.getInstance().getClientByName(temp[0]);
			Room room = RoomStorage.getInstance().getByNumber(Integer.parseInt(temp[1]));
			Date start = formatter.parse(temp[2]);
			Date end = formatter.parse(temp[3]);
			Visit visit = new Visit();	
			visit.setClient(client);
			visit.setRoom(room);
			visit.setStartDate(start);
			visit.setEndDate(end);
			return visit;
		}

}
