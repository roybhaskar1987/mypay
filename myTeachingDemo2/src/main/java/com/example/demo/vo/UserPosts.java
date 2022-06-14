package com.example.demo.vo;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "POSTS" )
public class UserPosts {
	
	
private UUID ID;

private String Description;

private Date CREATE_DATE;

private String USERID;

@Id
@GeneratedValue(generator = "UUID")
@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
@Column(name = "ID", columnDefinition = "varchar(50)")
@Type(type = "org.hibernate.type.UUIDCharType")
public UUID getID() {
	return ID;
}

public void setID(UUID iD) {
	ID = iD;
}


@Column(name = "DESCRIPTIONS")
public String getDescription() {
	return Description;
}

public void setDescription(String description) {
	Description = description;
}


  
  //@Type(type = "org.hibernate.type.UUIDCharType")

//@ManyToOne(fetch = FetchType.LAZY  )
@JsonIgnore
@Column(name = "USERID", columnDefinition = "varchar(50)" )
//@Type(type = "org.hibernate.type.UUIDCharType")
  public String   getUSERID() { 
	  return USERID; 
	  }
  
  public void setUSERID(String uSERID) { USERID = uSERID; }
 

@Column(name = "CREATE_DATE")
public Date getCREATE_DATE() {
	return CREATE_DATE;
}

public void setCREATE_DATE(Date cREATE_DATE) {
	CREATE_DATE = cREATE_DATE;
}

@Override
public String toString() {
	return "UserPosts [ID=" + ID + ", Description=" + Description + ", USERID=" + USERID + "]";
}





	
}
