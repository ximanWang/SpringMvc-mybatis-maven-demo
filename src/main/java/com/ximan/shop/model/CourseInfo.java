package com.ximan.shop.model;

public class CourseInfo {
	private Integer id;
	private String cname;
	private String address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "CourseInfo [id=" + id + ", cname=" + cname + ", address="
				+ address + "]";
	}
	
	
}
