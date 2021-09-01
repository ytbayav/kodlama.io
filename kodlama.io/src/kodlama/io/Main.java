package kodlama.io;

import business.abstracts.CategoryService;
import business.abstracts.CourseService;
import business.abstracts.InstructorService;
import business.concretes.CategoryManager;
import business.concretes.CourseManager;
import business.concretes.InstructorManager;
import dataAccess.concretes.SqlCategoryDao;
import dataAccess.concretes.SqlCourseDao;
import dataAccess.concretes.SqlInstructorDao;
import entities.concretes.Category;
import entities.concretes.Course;
import entities.concretes.Instructor;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("     Instructors  ");
		
		Instructor instructor = new Instructor(1, "Engin", "Demirog", "MCT,PMP,ITIL");
		
		InstructorService instructorService = new InstructorManager(new SqlInstructorDao());
		instructorService.add(instructor);
		
		for (Instructor instructorIndex : instructorService.getAll()) {
			System.out.println(instructorIndex);
		}
		
		
		
		System.out.println();
		System.out.println("     Category        ");
		
		Category category1 = new Category(1,"Programlama");
		Category category2 = new Category(2,"SQL");
		
		CategoryService categoryService = new CategoryManager(new SqlCategoryDao());
		categoryService.add(category1);
		categoryService.add(category2);

		System.out.println(categoryService.gelAll());
		
			
		
		
		
		CourseService courseService = new CourseManager(new SqlCourseDao());
		Course course = null;
		courseService.add(course);
		
		
		for (Course courseIndex : courseService.getAll()) {
			System.out.println(course);
			
			
		}
		
		
	}

}
