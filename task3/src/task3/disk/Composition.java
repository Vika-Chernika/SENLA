package task3.disk;


public abstract class Composition {
		
	 private int duration;
	 private String genre;
	
	 public Composition (int duration, String genre) {
		 this.duration = duration;
		 this.genre = genre;				
	 }
	 
	 public int getDuration() {
		 return duration;
	 }
	 
	 public void setDuration(int newDuration) {
		 duration = newDuration;
	 }
	 
	 public String getGenre() {
		 return genre;
	 }
	 
	 
}
