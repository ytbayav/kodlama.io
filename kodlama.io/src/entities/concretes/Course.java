package entities.concretes;

import entities.abstracts.Entity;

public class Course implements Entity{
	
	private int id;
	private String name;
	private double completionRate;
	private String imagePath;
	private String instructorImagePath;
	private Instructor instructor;
	private Category category;
	
	public Course() {
		super();
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", completionRate=" + completionRate + ", imagePath=" + imagePath
				+ ", instructorImagePath=" + instructorImagePath + ", instructor=" + instructor + ", category="
				+ category + "]";
	}

	public Course(int id, String name, double completionRate, String imagePath, String instructorImagePath,
			Instructor instructor, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.completionRate = completionRate;
		this.imagePath = imagePath;
		this.instructorImagePath = instructorImagePath;
		this.instructor = instructor;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCompletionRate() {
		return completionRate;
	}

	public String getImagePath() {
		return imagePath;
	}

	public String getInstructorImagePath() {
		return instructorImagePath;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public Category getCategory() {
		return category;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCompletionRate(double completionRate) {
		this.completionRate = completionRate;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public void setInstructorImagePath(String instructorImagePath) {
		this.instructorImagePath = instructorImagePath;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	

}
