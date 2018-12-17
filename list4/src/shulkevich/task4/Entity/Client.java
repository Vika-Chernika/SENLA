package shulkevich.task4.Entity;

public class Client {

	private String name;
	private Integer id;

	public Client() {
		
	}
	
	public Client(String code, String name, Integer id){
		this.name = name;	
		this.id = id;
	}
	
	public Client(Client client) {
		this.name = client.name;
		this.id = client.id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return new StringBuilder().append(name).append(";").toString();
	}
}
