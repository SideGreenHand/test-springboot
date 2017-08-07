package cn.com.testspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jiaoW on 2017/8/6.
 */
@Controller
public class TestTemplate {

    @RequestMapping("/index")
    public String returnIndex(ModelMap map){
        map.put("1","测试页面");
        map.put("2","测试body");
        return "index";
    }
}