package nuc.edu.chapter05_mybatis1_20201118.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import nuc.edu.chapter05_mybatis1_20201118.pojo.User;


public interface IUserDao {
	@Select("select * from t_user")
	//@Results用于映射对象属性和数据库列，常用于对象属性和数据库列不同名情况
	@Results(id="userResult",value={
		@Result(id=true,column="id",property="id"),	
		@Result(column="user_name",property="userName"),
		@Result(column="note",property="note"),
	})
	public List<User> findAllUser();
	@Select("select * from t_user where id=#{id}")
	//引用id=“userResult”的Results 
	@ResultMap("userResult")
	public User getUser(Integer id);
	
	@Select("select * from t_user "
			+ "where user_name like concat('%',#{userName},'%') "
			+ "and note like concat('%',#{note},'%')")
	//引用id=“userResult”的Results 
	@ResultMap("userResult")
	public List<User> findAllUser1(String userName,String note);
	
	@Insert("insert into t_user(user_name,note) values(#{userName},#{note})")
	@Options(useGeneratedKeys=true,keyProperty="id",keyColumn="id")
	public Integer insertUser(User user);
	
	
	@Delete("delete from t_user where id=#{id}")
	public Integer deleteUser(Integer id);
	
	
	@Update("update t_user set user_name=#{userName},note=#{note} where id=#{id}")
	public Integer updateUser(User user);
	
}
