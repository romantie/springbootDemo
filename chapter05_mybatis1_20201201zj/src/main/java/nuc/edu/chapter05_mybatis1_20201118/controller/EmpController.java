package nuc.edu.chapter05_mybatis1_20201118.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import nuc.edu.chapter05_mybatis1_20201118.dao.DeptMapper;
import nuc.edu.chapter05_mybatis1_20201118.dao.EmpMapper;
import nuc.edu.chapter05_mybatis1_20201118.pojo.Dept;
import nuc.edu.chapter05_mybatis1_20201118.pojo.Emp;

@Controller
@RequestMapping("emp")
public class EmpController {
	@Autowired
	private EmpMapper empMapper;

	// 通过URL传递参数
	@GetMapping("/{empno}")
	// 相应为JSON数据集
	@ResponseBody
	// @PathVariable 通过参数名称获取参数
	public Emp getEmpByEmpno(@PathVariable("empno") Integer empno) {
		return empMapper.findEmpByEmpno(empno);
	}
}
