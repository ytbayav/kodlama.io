package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;

public class SqlCourseDao implements CourseDao{

	
	ArrayList<Course> cours;
	
	public SqlCourseDao(){
		super();
		this.cours = new ArrayList<Course>();
	}
	
	
	@Override
	public void add(Course entity) {
		this.cours.add(entity);
		
	}

	@Override
	public ArrayList<Course> getAll() {
		return this.cours;
	}

}
