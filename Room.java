package shulkevich.task4.Entity;


import shulkevich.task4.Utils.Type;

public class Room {

		private Integer number;
		private Integer price;
		private Integer size;
		private Type rate;
		private Boolean isFree;
		private Boolean isAvailable;
		private Integer id;
		
		public Room() {
			
		}
		
		public Room(Room room) {
			this.number = room.number;
			this.price = room.price;
			this.size = room.size;
			this.rate = room.rate;
			this.isFree = room.isFree;
			this.isAvailable = room.isAvailable;
			this.id = room.id;
		}
		
		public Room(Integer number, Integer price, Integer size, Type rate, Boolean isFree, Boolean isAvailable, Integer id) {
			this.number = number;
			this.price = price;
			this.size = size;
			this.rate = rate;
			this.isFree = isFree;
			this.isAvailable = isAvailable;
			this.id = id;
		}
		
		public Integer getNumber() {
			return number;
		}
		public void setNumber(Integer number) {
			this.number = number;
		}
		public Integer getPrice() {
			return price;
		}
		public void setPrice(Integer price) {
			this.price = price;
		}
		public Integer getSize() {
			return size;
		}
		public void setSize(Integer size) {
			this.size = size;
		}
		public Type getRate() {
			return rate;
		}
		public void setRate(Type rate) {
			this.rate = rate;
		}
		public Boolean isFree() {
			return isFree;
		}
		public void setFree(Boolean isFree) {
			this.isFree = isFree;
		}
		public Boolean isAvailable() {
			return isAvailable;
		}
		public void setAvailable(Boolean isAvailable) {
			this.isAvailable = isAvailable;
		}
		
		public Integer getId() {
			return id;
		}
		
		public void setId(Integer id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return new StringBuilder().append(number).append(";").append(price).append(";").append(size)
					.append(";").append(rate.ordinal()).append(";").append(isFree).append(";").append(isAvailable).toString();
		}
}
