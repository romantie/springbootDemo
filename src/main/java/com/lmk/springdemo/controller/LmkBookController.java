package com.lmk.springdemo.controller;

import com.lmk.springdemo.entity.LmkBook;
import com.lmk.springdemo.service.LmkIbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/LmkBook")
public class LmkBookController {
    //注入书籍服务类
    @Autowired
    private LmkIbookService lmkIbookService;

    /**
     * 添加insert
     * 查询所有
     * 按id查询，展示结果为json数据
     */
    @RequestMapping("/bookDetailForJson")
    public ModelAndView bookDetailForJson(int id){
        LmkBook book = lmkIbookService.findBookById(id);
        //模型和视图
        ModelAndView modelAndView = new ModelAndView();
        //生成json数据
        MappingJackson2JsonView mappingJackson2JsonView = new MappingJackson2JsonView();
        modelAndView.setView(mappingJackson2JsonView);
        //加入模型
        modelAndView.addObject("book",book);
        return modelAndView;
    }

    //按id查询，展示结果为jsp视图
    @RequestMapping("/detailesForJsp")
    public ModelAndView detailsForJsp(int id){
        LmkBook Book = lmkIbookService.findBookById(id);
        ModelAndView modelAndView = new ModelAndView();
        // 定义模型视图
        // 视图路径： application.property文件中设置 spring.mvc.view.prefix = /WEB-INF/jsp
        // 视图名称: LmkBook/detailsForJsp
        modelAndView.setViewName("LmkBook/detailesForJsp");
        modelAndView.addObject("book",Book);
        return modelAndView;
    }

    /**
     * 打开请求页面
     * @return 字符串，只想页面
     */
    @GetMapping("/add")
    public String add(){
        return "LmkBook/add";
    }
    /**
     * 添加书籍
     * @param lmkBook 通过@RequestBody注解得到JSON参数
     * @return
     */
    
    @RequestMapping("/insert")
    public ModelAndView insert(LmkBook lmkBook, @RequestParam("photo") MultipartFile file){

        String fileUrl = upload(file);
        System.out.println(fileUrl);
        lmkBook.setFile(fileUrl);
        System.out.println(lmkBook);
        lmkIbookService.addBook(lmkBook);
        List<LmkBook> allBooks = lmkIbookService.findAllBook();

        System.out.println(allBooks.subList(0,4));

        ModelAndView mv = new ModelAndView();
        mv.setViewName("LmkBook/detailesForJsp");
        mv.addObject("book",lmkBook);

        return mv;
    }
    /**
     * 查询多个书籍数据，jsp显示
     */
    @RequestMapping("detailesBookForJsp")
    public ModelAndView findAllUser(){
        List<LmkBook> allBooks = lmkIbookService.findAllBook();
        System.out.println(allBooks.subList(3,5));
        ModelAndView mv = new ModelAndView();
        mv.setViewName("LmkBook/detailesBookForJsp");
        mv.addObject("book",allBooks);

        return mv;

    }
    //通过url传递参数
    @RequestMapping("{id}")
    //响应为json的数据
    @ResponseBody
    public LmkBook getUser(@PathVariable("id") int id ){
        return lmkIbookService.findBookById(id);
    }

    /**
     * 上传单个图片
     * @param file 文件路径
     * @return
     */

    private String upload(MultipartFile file) {
        // 文件：文件路径+前缀+后缀
        // 文件路径
        String path = "F:/IDEA/maven_workplace/springdemo/src/main/resources/static/images/load/";
        // 定义新文件的前缀
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String prefix = sdf.format(new Date());
        // 文件后缀
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        // 判断是否为图片格式的后缀
        if (!suffix.equals(".jpg")){
            return null;
        }
        try{
            FileCopyUtils.copy(file.getInputStream(),new FileOutputStream(path+prefix+suffix));
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return "images/load/"+prefix+suffix;
    }

}
