//package lk.ijse.backend.entity;
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
//@Table(name = "schedule")
//public class schedule {
//
//	public schedule() {
//
//	}
//
//	public schedule(String sc_Id, String time_Slot, int max_Patient_Count, lk.ijse.backend.entity.doctor doctor,
//			lk.ijse.backend.entity.day day) {
//		this.sc_Id = sc_Id;
//		this.time_Slot = time_Slot;
//		this.max_Patient_Count = max_Patient_Count;
////		this.doctor = doctor;
////		this.day = day;
//	}
//
//	@Id
//	@Column(name = "sc_Id")
//	private String sc_Id;
//
//	public String getSc_Id() {
//		return sc_Id;
//	}
//
//	public void setSc_Id(String sc_Id) {
//		this.sc_Id = sc_Id;
//	}
//
//	@Column(name = "time_Slot")
//	private String time_Slot;
//
//	public String getTime_Slot() {
//		return time_Slot;
//	}
//
//	public void setTime_Slot(String time_Slot) {
//		this.time_Slot = time_Slot;
//	}
//
//	@Column(name = "max_Patient_Count")
//	private int max_Patient_Count;
//
//	public int getMax_Patient_Count() {
//		return max_Patient_Count;
//	}
//
//	public void setMax_Patient_Count(int max_Patient_Count) {
//		this.max_Patient_Count = max_Patient_Count;
//	}
//
////	@ManyToOne(cascade = CascadeType.ALL)
////	@JoinColumn(name = "dr_Id", referencedColumnName = "droctor_Id", insertable = false, updatable = false)
////	private doctor doctor;
////
////	public doctor getDoctor() {
////		return doctor;
////	}
////
////	public void setDoctor(doctor doctor) {
////		this.doctor = doctor;
////	}
//
////	@ManyToOne(cascade = CascadeType.ALL)
////	@JoinColumn(name = "day_Name", referencedColumnName = "day_Name", insertable = false, updatable = false)
////	private day day;
////
////	public day getDay() {
////		return day;
////	}
////
////	public void setDay(day day) {
////		this.day = day;
////	}
////
////	@Override
////	public String toString() {
////		return "schedule [sc_Id=" + sc_Id + ", time_Slot=" + time_Slot + ", max_Patient_Count=" + max_Patient_Count
////				+ ", doctor=" + doctor + ", day=" + day + "]";
////	}
//
//}
