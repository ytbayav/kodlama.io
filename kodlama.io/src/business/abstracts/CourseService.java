package business.abstracts;

import java.util.ArrayList;

import entities.concretes.Course;

public interface CourseService {
	
	ArrayList<Course> getAll();
	void add(Course course);

}
