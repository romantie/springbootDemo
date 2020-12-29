package nuc.edu.chapter05_mybatis1_20201118.dao;

import java.util.List;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import nuc.edu.chapter05_mybatis1_20201118.pojo.Emp;

public interface EmpMapper {
    //根据部门编号查询所有员工
	@Select("select * from emp where deptno=#{deptno}")
    public List<Emp> findEmpByDeptno(Integer deptno);
	//根据员工编号获取员工信息
	@Select("select * from emp where empno=#{empno}")
	@Results({
		@Result(column="deptno",property="dept",
				one=@One(select="nuc.edu.chapter05_mybatis1_20201118.dao.DeptMapper.findDeptByDeptno1"))
	})
	public Emp findEmpByEmpno(Integer empno);
}
