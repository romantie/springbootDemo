package nuc.edu.chapter05_mybatis1_20201118.dao;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.One;

import nuc.edu.chapter05_mybatis1_20201118.pojo.Sclass;

public interface SclassMapper {
   @Select("select * from class where c_id=#{id}")
   @Results(id="classResult",value= {
	  @Result(id=true,property="id",column="c_id"),
	  @Result(property="name",column="c_name"),
	  @Result(property="teacher",column="teacher_id",
	          one=@One(select="nuc.edu.chapter05_mybatis1_20201118.dao.TeacherMapper.findTeacherById")),
		   })
   //根据id查询班级信息
   public Sclass findClassById(Integer id);
}
