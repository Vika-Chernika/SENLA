package shulkevich.task4.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import shulkevich.task4.Entity.Client;
import shulkevich.task4.Entity.Room;
import shulkevich.task4.Entity.Visit;
import shulkevich.task4.Storage.ClientStorage;
import shulkevich.task4.Storage.RoomStorage;
import shulkevich.task4.Storage.VisitStorage;
import shulkevich.task4.Utils.Parser;
import shulkevich.task4.Utils.Worker;

public class VisitService {
	
	private VisitStorage visitsRep = VisitStorage.getInstance();
	
	public void read(String path){
		String[] data = Worker.readAll(path);
		for (int i = 0; i < data.length; i++) {
			visitsRep.create(Parser.parseVisit(data[i]));
		}
	}
}
