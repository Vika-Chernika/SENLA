package task3.disk;

import task3.disk.Composition;


public class Disk {
	
	Composition[] myDisk;
	
	public void createMyDisk (Composition[] record) {
		this.myDisk = record;
	}
	
	private int getDuration (Composition[] myDisk) {
		int duration = 0;
		for (Composition composition:myDisk) {
			duration += composition.getDuration();
		}
			return duration;
	}
	
	public int getDiskDuration() {
		
		return getDuration(myDisk);
				
	}
}
