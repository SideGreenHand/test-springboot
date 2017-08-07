package cn.com.testspringboot.filter;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jiaoW on 2017/8/6.
 */
@Configuration
public class WebConfiguration {
    @Bean
    public RemoteIpFilter remoteIpFilter(){
        return new RemoteIpFilter();
    }
/*多个filter创建多个下面方法*/
    @Bean
    public FilterRegistrationBean testFilterRegistration(){
        FilterRegistrationBean filterRegistration = new FilterRegistrationBean();
        filterRegistration.setFilter(new MyFilter());//设置filter
        filterRegistration.setName("Myfilter");//设置filter名称
        filterRegistration.addInitParameter("paramName","paramVlaue");
        filterRegistration.addUrlPatterns("/*");//设置拦截路径
        filterRegistration.setOrder(1);
        return filterRegistration;
    }

    @Bean
    public FilterRegistrationBean testFilterTwo2(){
        FilterRegistrationBean filterRegistration = new FilterRegistrationBean();
        filterRegistration.setFilter(new FilterTwo());//设置filter
        filterRegistration.setName("filtertwo");//设置filter名称
        filterRegistration.addInitParameter("paramName","paramVlaue");
        filterRegistration.addUrlPatterns("/*");
        filterRegistration.setOrder(2);
        return filterRegistration;
    }


    public class MyFilter implements Filter {
        @Override
        public void destroy() {

        }

        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            HttpServletRequest request = (HttpServletRequest) servletRequest;
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            System.out.println("进入MYfinishiashdiaslter："+request.getRequestURI());
            filterChain.doFilter(request,response);

        }

        @Override
        public void init(FilterConfig filterConfig) throws ServletException {

        }
    }

    public class FilterTwo implements Filter{

        @Override
        public void init(FilterConfig filterConfig) throws ServletException {

        }

        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            HttpServletRequest req = (HttpServletRequest) servletRequest;
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            System.out.println("进入filter2");
            filterChain.doFilter(req,response);
        }

        @Override
        public void destroy() {

        }
    }
}
