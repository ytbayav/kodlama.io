package business.concretes;

import java.util.ArrayList;

import business.abstracts.InstructorService;
import dataAccess.abstracts.InstructorDao;
import entities.concretes.Instructor;

public class InstructorManager implements InstructorService {
	
	InstructorDao instructorDao;
	
	public InstructorManager(InstructorDao instructorDao) {
		super();
		this.instructorDao = instructorDao;
		
	}
	

	
	
	
	@Override
	public ArrayList<Instructor> getAll() {
		
		return this.instructorDao.getAll();
	}

	@Override
	public void add(Instructor instructor) {
		this.instructorDao.add(instructor);
		
	}

}
