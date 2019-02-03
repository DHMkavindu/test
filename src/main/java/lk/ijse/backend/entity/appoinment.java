//package lk.ijse.backend.entity;
//
//import java.sql.Date;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "appoinment")
//public class appoinment {
//
//	public appoinment() {
//
//	}
//
//	public appoinment(String ap_Id, String ap_No, Date ap_Date, lk.ijse.backend.entity.patient patient,
//			lk.ijse.backend.entity.schedule schedule) {
//		this.ap_Id = ap_Id;
//		this.ap_No = ap_No;
//		this.ap_Date = ap_Date;
////		this.patient = patient;
////		this.schedule = schedule;
//	}
//
//	@Id
//	@Column(name = "ap_Id")
//	private String ap_Id;
//
//	public String getAp_Id() {
//		return ap_Id;
//	}
//
//	public void setAp_Id(String ap_Id) {
//		this.ap_Id = ap_Id;
//	}
//
//	@Column(name = "ap_No")
//	private String ap_No;
//
//	public String getAp_No() {
//		return ap_No;
//	}
//
//	public void setAp_No(String ap_No) {
//		this.ap_No = ap_No;
//	}
//
//	@Column(name = "ap_Date")
//	private Date ap_Date;
//
//	public Date getAp_Date() {
//		return ap_Date;
//	}
//
//	public void setAp_Date(Date ap_Date) {
//		this.ap_Date = ap_Date;
//	}
//
////	@ManyToOne(cascade = CascadeType.ALL)
////	@JoinColumn(name = "p_Id", referencedColumnName = "patient_Id", insertable = false, updatable = false)
////	private patient patient;
//
////	public patient getPatient() {
////		return patient;
////	}
////
////	public void setPatient(patient patient) {
////		this.patient = patient;
////	}
//
////	@ManyToOne(cascade = CascadeType.ALL)
////	@JoinColumn(name = "sc_Id", referencedColumnName = "sch_Id", insertable = false, updatable = false)
////	private schedule schedule;
//
////	public schedule getSchedule() {
////		return schedule;
////	}
////
////	public void setSchedule(schedule schedule) {
////		this.schedule = schedule;
////	}
//
//}
