package business.abstracts;

import java.util.ArrayList;
import java.util.Locale.Category;

public interface CategoryService {
	
	ArrayList<Category> gelAll();
	void add(entities.concretes.Category category2);
	void add(Category category);

}
