package dataAccess.abstracts;

import java.util.ArrayList;

public interface EntityRepository<T> {
	
	void add(T entity);
	ArrayList<T> getAll();

}
