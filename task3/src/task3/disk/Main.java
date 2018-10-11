package task3.disk;

import task3.disk.Disk;
import task3.disk.Composition;
import task3.disk.Pop;
import task3.disk.Rock;
import task3.disk.Jazz;
  


public class Main {

	public static void main(String[] args) {
		
		Disk disk = new Disk();
		
		disk.createMyDisk(new Composition[]
				{new Pop(1), new Jazz(3), new Pop(2), new Rock(), new Rock(6), new Pop()});
		System.out.print(disk.getDiskDuration());
		
	}

}
