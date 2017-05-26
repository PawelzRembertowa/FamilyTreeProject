package model;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Person {

	private final int id;
	private Sex sex;
	private String name;
	private String surname;
	private String birthDate;
	private String deathDate;
	
	private int motherId;
	private int fatherId;
	private List<Integer> childrenId;


	
	
	public Person(int id, String name, String surname, String birthDate, String deathDate) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.deathDate = deathDate;
		childrenId = Collections.emptyList();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getDeathDate() {
		return deathDate;
	}
	public void setDeathDate(String deathDate) {
		this.deathDate = deathDate;
	}
	public int getId() {
		return id;
	}
	
	
	
}
