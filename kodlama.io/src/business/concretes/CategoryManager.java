package business.concretes;

import java.util.ArrayList;
import java.util.Locale.Category;

import business.abstracts.CategoryService;
import dataAccess.abstracts.CategoryDao;

public class CategoryManager implements CategoryService {
	
	CategoryDao categoryDao;
	
	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}

	@Override
	public ArrayList<Category> gelAll() {
		
		return this.categoryDao.getAll();
	}

	@Override
	
	public void add(Category category) {
		
		this.categoryDao.add(category);
		
		
	}

	@Override
	public void add(entities.concretes.Category category2) {
		// TODO Auto-generated method stub
		
	}

}
