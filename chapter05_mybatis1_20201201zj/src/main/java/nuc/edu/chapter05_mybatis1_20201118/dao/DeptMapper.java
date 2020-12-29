package nuc.edu.chapter05_mybatis1_20201118.dao;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Many;

import nuc.edu.chapter05_mybatis1_20201118.pojo.Dept;

public interface DeptMapper {
	@Select("select * from dept where deptno=#{deptno}")
	@Results({
		@Result(id=true,column="deptno",property="deptno"),
		@Result(column="dname",property="dname"),
		@Result(column="deptno",property="deptno"),
		@Result(column="loc",property="loc"),
		@Result(property="emps",column="deptno",
				many=@Many(select="nuc.edu.chapter05_mybatis1_20201118.dao.EmpMapper.findEmpByDeptno"))
	})
   public Dept findDeptByDeptno(Integer deptno);
	
   @Select("select * from dept where deptno=#{deptno}")
   public Dept findDeptByDeptno1(Integer deptno);	
}
