package shulkevich.task4.Entity;

import shulkevich.task4.Utils.Type;

public class Service {

		private String name;
		private Integer price;
		private Integer id;
		private Type type;
		
		public Service() {
			
		}
		
		public Service(String name, Integer price, Integer id, Type type) {
			this.name =  name;
			this.price = price;
			this.id = id;
			this.type = type;
		}
		
		public Service(Service service) {
			this.name = service.name;
			this.price = service.price;
			this.id = service.id;
			this.type = service.type;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		public int getId() {
			return id;
		}
		
		public void setId(Integer id) {
			this.id = id;
		}

		public Type getType() {
			return type;
		}
		public void setType(Type type) {
			this.type = type;
		}
		
		@Override
		public String toString() {
			return new StringBuilder().append(name).append(";").append(price).toString();
		}
}
