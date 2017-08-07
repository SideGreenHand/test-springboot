package cn.com.testspringboot.controller;

import cn.com.testspringboot.domain.properties.TestSpringBootProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiaoW on 2017/8/5.
 */
@RestController
public class HelloWorldController {

    @Autowired
    private TestSpringBootProperties testSpringBootProperties;

    @RequestMapping("/helloworld")
    public Map<String, String> sayHelloWord(HttpServletRequest request){
        String name = request.getParameter("name");
        System.out.println(name);
        HashMap<String, String> map = new HashMap<>();
        System.out.println(testSpringBootProperties.getName());
        map.put("1","小明");
        map.put("2","heiheihei");
        return map;
    }
}
