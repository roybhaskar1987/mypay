package com.example.demo.vo;


import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.Where;



@Entity
@Table(name = "USER_MASTER")  
@Where(clause = "RECORD_STATUS=1" )
public class UserMasterVo {

	private UUID ID;
	
	@Size(min = 4, max = 20, message = "username Should be between 4 and 20 Charecters")
	private String USERNAME;
	
	private String PASSWORD;
	private Date CREATE_DATE;
	private Integer RECORD_STATUS=1;
	private Date UPDATE_DATE;
	private String OPT_FLAG;
	private String FLAG1;
	
	@OneToMany(targetEntity = UserPosts.class , cascade = CascadeType.ALL ,fetch = FetchType.EAGER)
	@JoinColumn(name = "USERID", referencedColumnName = "ID" )
	private List <UserPosts> POST;
	

	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "ID", updatable = true, nullable = false)
	
	
	@Id
	    @GeneratedValue(generator = "UUID")
	    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	    @Column(name = "ID", columnDefinition = "varchar(50)")
	    @Type(type = "org.hibernate.type.UUIDCharType")
	public UUID getID() {
		return ID;
	}
	public List<UserPosts> getPOST() {
		return POST;
	}
	public void setPOST(List<UserPosts> pOST) {
		POST = pOST;
	}
	public void setID(UUID iD) {
		ID = iD;
	}
	
	@Column(name = "USERNAME")
	public String getUSERNAME() {
		return USERNAME;
	}
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	
	@Column(name = "PASSWORD")
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	
	@Column(name = "CREATE_DATE")
	public Date getCREATE_DATE() {
		return CREATE_DATE;
	}
	public void setCREATE_DATE(Date cREATE_DATE) {
		CREATE_DATE = cREATE_DATE;
	}
	
	@Column(name = "RECORD_STATUS")
	public Integer getRECORD_STATUS() {
		return RECORD_STATUS;
	}
	public void setRECORD_STATUS(Integer rECORD_STATUS) {
		RECORD_STATUS = rECORD_STATUS;
	}
	
	@Column(name = "UPDATE_DATE")
	public Date getUPDATE_DATE() {
		return UPDATE_DATE;
	}
	public void setUPDATE_DATE(Date uPDATE_DATE) {
		UPDATE_DATE = uPDATE_DATE;
	}
	
	@Column(name = "OPT_FLAG")
	public String getOPT_FLAG() {
		return OPT_FLAG;
	}
	public void setOPT_FLAG(String oPT_FLAG) {
		OPT_FLAG = oPT_FLAG;
	}
	
	@Column(name = "FLAG1")
	public String getFLAG1() {
		return FLAG1;
	}
	public void setFLAG1(String fLAG1) {
		FLAG1 = fLAG1;
	}
	
	/*
	 * public List<UserPosts> getPost() { return post; }
	 * 
	 * public void setPost(List<UserPosts> post) { this.post = post; }
	 */
		
	
	 
	 
		@Override
		public String toString() {
			return "UserMasterVo [ID=" + ID + ", USERNAME=" + USERNAME + ", PASSWORD=" + PASSWORD + ", CREATE_DATE="
					+ CREATE_DATE + ", RECORD_STATUS=" + RECORD_STATUS + ", UPDATE_DATE=" + UPDATE_DATE + ", OPT_FLAG="
					+ OPT_FLAG + ", FLAG1=" + FLAG1 + "]";
		}
	
	
}
