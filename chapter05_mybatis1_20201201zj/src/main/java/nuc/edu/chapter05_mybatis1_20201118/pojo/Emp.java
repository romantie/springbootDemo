package nuc.edu.chapter05_mybatis1_20201118.pojo;

import java.util.Date;

public class Emp {
	private Integer empno;
	private String ename;
	private String job;
	private Integer mgr;
	private Date hiredate;
	private Float sal;
	private Float comm;
	private Dept dept;

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Integer getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public String getJob() {
		return job;
	}

	public Integer getMgr() {
		return mgr;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public Float getSal() {
		return sal;
	}

	public Float getComm() {
		return comm;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public void setSal(Float sal) {
		this.sal = sal;
	}

	public void setComm(Float comm) {
		this.comm = comm;
	}

}
