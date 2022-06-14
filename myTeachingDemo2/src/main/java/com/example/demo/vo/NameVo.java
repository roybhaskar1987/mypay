package com.example.demo.vo;

import java.util.Objects;

public class NameVo {
	
	private String FirstName;
	
	private String LastName;

	@Override
	public int hashCode() {
		return Objects.hash(FirstName, LastName);
	}

	public NameVo(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}

	public NameVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NameVo other = (NameVo) obj;
		return Objects.equals(FirstName, other.FirstName) && Objects.equals(LastName, other.LastName);
	}
	
	
	
	

}
