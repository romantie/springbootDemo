package nuc.edu.chapter05_mybatis1_20201118.dao;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import nuc.edu.chapter05_mybatis1_20201118.pojo.Teacher;

public interface TeacherMapper {
   @Select("select * from teacher where t_id=#{id}")
   @Results(id="teacherResult",value= {
	  @Result(id=true,property="id",column="t_id"),
	  @Result(property="name",column="t_name"),
   })
   public Teacher findTeacherById(Integer id);
}
