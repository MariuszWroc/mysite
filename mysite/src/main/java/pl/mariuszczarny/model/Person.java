package pl.mariuszczarny.model;

import java.util.List;

public final class Person {
	private final String firstname;
	private final String lastname;
	private final String description;
	private final List<Project> projectList;
	
	public Person(String firstname, String lastname, String description, List<Project> projectList) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.description = description;
		this.projectList = projectList;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getDescription() {
		return description;
	}
	public List<Project> getProjectList() {
		return projectList;
	}
	
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", description=" + description
				+ ", projectList=" + projectList + "]";
	}
	
}
