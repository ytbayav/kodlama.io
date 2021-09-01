package business.concretes;

import java.util.ArrayList;

import business.abstracts.CourseService;
import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;

public class CourseManager implements CourseService {
	
	CourseDao courseDao;
	
	public CourseManager(CourseDao courseDao) {
		super();
		this.courseDao = courseDao;
	}
		
	

	@Override
	public ArrayList<Course> getAll() {
		
		return this.courseDao.getAll();
	}

	@Override
	public void add(Course course) {
		
		this.courseDao.add(course);
				
	}

}
