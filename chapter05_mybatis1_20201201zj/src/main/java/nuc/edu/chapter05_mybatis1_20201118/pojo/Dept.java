package nuc.edu.chapter05_mybatis1_20201118.pojo;

import java.util.List;

public class Dept {
	private Integer deptno;
	private String dname;
	private String loc;
	private List<Emp> emps;
	
	

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public String getDname() {
		return dname;
	}

	
	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	

}
