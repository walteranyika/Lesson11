package com.walter.lesson11;

public class Person {
	private String names, email, age;
	public Person(String names, String email, String age) {
		super();
		this.names = names;
		this.email = email;
		this.age = age;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
   
}
