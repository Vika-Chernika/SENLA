package shulkevich.task4.Interfaces;

public interface IRepository<T> {

	public void create(T item);
	public T read(Integer id);
	public void update(T item);
	public void delete(Integer i);
	
}
