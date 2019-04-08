package com.neu.springt.pojo;

public class Dept {
	private Integer dno;
	private String dname;
	private String dloc;
	public Integer getDno() {
		return dno;
	}
	public void setDno(Integer dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDloc() {
		return dloc;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	public Dept(Integer dno, String dname, String dloc) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.dloc = dloc;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
}
