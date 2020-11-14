package com.lmk.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.ObjDoubleConsumer;

@Controller
public class LmkUploadController {
    /**
     *打开文件上传页面
     * @return 指向jsp的字符串
     */
    @GetMapping("/upload/page")
    public String uploadPage(){
        return "/file/upload";
    }
    @GetMapping("/upload/page1")
    public String uploadPage1(){
        return "/file/upload1";
    }
    /**
     * 单个文件上传
     */
    @PostMapping("upload/multipart")
    @ResponseBody
    public Map<String ,Object> upload(@RequestParam("photo") MultipartFile photo){
        String path = "F:\\IDEA\\maven_workplace\\springdemo\\src\\main\\resources\\images\\upFile\\";
        String filename = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        //获取文件的后缀suffix
        String suffix = photo.getOriginalFilename().substring(photo.getOriginalFilename().lastIndexOf("."));
        if (!suffix.equals(".jpg")){
            return dealResultMap(false,"上传失败");
        }
        try{
            FileCopyUtils.copy(photo.getInputStream(),new FileOutputStream(path+filename+suffix));

    } catch (FileNotFoundException e) {
            e.printStackTrace();
            return dealResultMap(false,"上传失败");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dealResultMap(true,"上传成功");

}
    /**
     * 多个文件上传
     */
    @PostMapping("upload/multipart1")
    @ResponseBody
    public Map<String ,Object> upload(@RequestParam("photo") MultipartFile[] photos){
        String path = "F:\\IDEA\\maven_workplace\\springdemo\\src\\main\\resources\\images\\upFile\\";

        for (MultipartFile photo :photos) {
            if (!photo.isEmpty()) {
                String filename1 = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
                //获取文件的后缀suffix
                String suffix = photo.getOriginalFilename().substring(photo.getOriginalFilename().lastIndexOf("."));
                if (!suffix.equals(".jpg")) {
                    return dealResultMap(false, "上传失败");
                }
                try {
                    FileCopyUtils.copy(photo.getInputStream(), new FileOutputStream(path + filename1 + suffix));

                } catch (IOException e) {
                    e.printStackTrace();
                    return dealResultMap(false, "上传失败");

                }
            }
        }
        return dealResultMap(true, "上传成功");
    }

    private Map<String, Object> dealResultMap(boolean success, String msg) {
        Map<String, Object> result = new HashMap<String,Object>();
        result.put("success",success);
        result.put("msg",msg);
        return result;
    }

}
