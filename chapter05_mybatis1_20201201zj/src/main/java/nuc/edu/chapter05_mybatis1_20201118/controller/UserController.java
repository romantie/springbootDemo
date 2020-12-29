package nuc.edu.chapter05_mybatis1_20201118.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import nuc.edu.chapter05_mybatis1_20201118.param.UserParam;
import nuc.edu.chapter05_mybatis1_20201118.pojo.User;
import nuc.edu.chapter05_mybatis1_20201118.service.IUserService;

@Controller
@RequestMapping("user")
public class UserController {
   // 注入用户服务类
   @Autowired
   private IUserService userService;
   @Autowired
   private User user;
 
   // 通过URL传递参数
   @GetMapping("/{id}")
   // 相应为JSON数据集
   @ResponseBody
   // @PathVariable 通过参数名称获取参数
   public User get(@PathVariable("id") Integer id) {
	   return userService.getUser(id);
   }
   
   @RequestMapping("/list1")
   @ResponseBody
   public List<User> list1(){
	   List<User> users=userService.findAllUser();
	   for (User user : users) {
			System.out.println(user.getUserName());
	   }
	   return users;
   }
   
   @RequestMapping("/list2")
   @ResponseBody
   public List<User> list2(@RequestParam(value="userName",required=false) String userName,
		                   @RequestParam(value="note",required=false) String note ){
	   List<User> users=userService.findAllUser1(userName, note);
	   
	   for (User user : users) {
			System.out.println(user.getUserName());
	   }
	   return users;
   }
   @RequestMapping("/insert")
   @ResponseBody
   public Integer insert(@RequestParam(value="userName",required=false) String userName,
           @RequestParam(value="note",required=false) String note) {
	   user.setUserName(userName);
	   user.setNote(note);
	   userService.insertUser(user);
	   return user.getId();
   }
   
   @RequestMapping("/delete")
   @ResponseBody
   public String insert(@RequestParam("id") Integer id) {
	   
	   return "删除数据【" +userService.deleteUser(id)+"】条";
   }
   
   @RequestMapping("update")
   @ResponseBody
   public String update(User user) {
	   return "更新数据【" +userService.updateUser(user)+"】条";
   }
}
