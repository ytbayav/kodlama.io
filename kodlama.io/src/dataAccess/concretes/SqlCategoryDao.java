package dataAccess.concretes;

import java.util.ArrayList;
import java.util.Locale.Category;

import dataAccess.abstracts.CategoryDao;

public class SqlCategoryDao implements CategoryDao{
	
	ArrayList<Category> categories;
	
	public SqlCategoryDao(){
		super();
		this.categories = new ArrayList<Category>();
	}

	@Override
	public void add(Category entity) {
		this.categories.add(entity);
		
	}

	@Override
	public ArrayList<Category> getAll() {
	
		return this.categories;
	}

}
