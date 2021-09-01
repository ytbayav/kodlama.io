package business.abstracts;

import java.util.ArrayList;

import entities.concretes.Instructor;

public interface InstructorService {
	
	ArrayList<Instructor> getAll();
	void add(Instructor instructor);

}
