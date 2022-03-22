package com.assignment.cg;

public class Student {
	private String studId;
	private String studName;
	private String studDept;
	private String studMailId;
	private int studMarks;
	
	
	public Student(String studId, String studName, String studDept, String studMailId, int studMarks) {
		this.studId = studId;
		this.studName = studName;
		this.studDept = studDept;
		this.studMailId = studMailId;
		this.studMarks = studMarks;
	}
	
	public boolean isEqual(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj instanceof Student) {
			Student stud = (Student) obj;
			return ( (stud.studId.equals(this.studId)) && (stud.studName.equals(this.studName)) && (stud.studDept.equals(this.studDept)) && (stud.studMailId.equals(this.studMailId)) && (stud.studMarks==this.studMarks) );
		}
		return false;
	}
	
	public static void main(String[] args) {
		Student student01 = new Student("ST01","Bruce Banner","Bio","brucebanner@gmail.com",82);
		Student student02 = new Student("ST02","Anthoy Stark","ME","tonystark@gmail.com",65);
		Student student03 = new Student("ST03","Scott Lang","EE","lang.scotty@gmail.com",55);
		Student student04 = new Student("ST01","Bruce Banner","Bio","brucebanner@gmail.com",82);
		
		System.out.println(student01.isEqual(student04));
		System.out.println(student02.isEqual(student02));
		System.out.println(student03.isEqual(student01));
	}
}
