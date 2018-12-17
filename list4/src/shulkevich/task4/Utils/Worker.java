package shulkevich.task4.Utils;

import com.senla.training.TextFileWorker;

public class Worker {
		
		public static String[] readAll(String path) {
			TextFileWorker worker = new TextFileWorker(path);
			return worker.readFromFile();
		}
		
		public static void writeAll(String[] arrayList, String path) {
			TextFileWorker worker = new TextFileWorker(path);
			worker.writeToFile(arrayList);
		}
	
}
