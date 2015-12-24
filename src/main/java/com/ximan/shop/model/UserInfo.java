package com.ximan.shop.model;

import java.util.List;

public class UserInfo {
	private Integer id;
	private String uname;
	private Integer unumber;
	private List<CourseInfo> coursesInfos;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname == null? null : uname.trim();
	}
	public Integer getUnumber() {
		return unumber;
	}
	public void setUnumber(Integer unumber) {
		this.unumber = unumber;
	}
	public List<CourseInfo> getCourses() {
		return coursesInfos;
	}
	public void setCourses(List<CourseInfo> coursesInfos) {
		this.coursesInfos = coursesInfos;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", uname=" + uname + ", unumber="
				+ unumber + ", courses=" + coursesInfos + "]";
	}
	
}
