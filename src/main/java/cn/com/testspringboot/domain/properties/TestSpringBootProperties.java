package cn.com.testspringboot.domain.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by jiaoW on 2017/8/6.
 * 配置信息类，读取配置文件application.properties中信息
 */
@Component
public class TestSpringBootProperties {
    @Value("${name}")
    private String name;

    @Value("${value}")
    private String vlaue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVlaue() {
        return vlaue;
    }

    public void setVlaue(String vlaue) {
        this.vlaue = vlaue;
    }
}
