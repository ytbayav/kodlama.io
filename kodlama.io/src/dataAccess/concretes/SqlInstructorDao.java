package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.InstructorDao;
import entities.concretes.Instructor;

public class SqlInstructorDao implements InstructorDao{
	
	ArrayList<Instructor> instructors;
	
	public SqlInstructorDao() {
		super();
		this.instructors = new ArrayList<Instructor>();
	}

	@Override
	public void add(Instructor entity) {
		this.instructors.add(entity);
		
		
	}

	@Override
	public ArrayList<Instructor> getAll() {
				return this.instructors;
	}

}
