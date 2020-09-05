package com.company.configurer;

import com.company.commons.interceptor.LogInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: kaichenkai
 * @create: 9/2/2020 11:38
 */
@Configuration
public class MvcConfigurer implements WebMvcConfigurer {
    /**
     * 通过@Bean注解，将我们定义的拦截器注册到Spring容器
     * @return
     */
    @Bean
    public LogInterceptor getLogInterceptor(){
        return new LogInterceptor();
    }

    /**
     * 重写接口中的addInterceptors方法，添加自定义拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 通过registry来注册拦截器，通过addPathPatterns来添加拦截路径
        //registry.addInterceptor(this.getLogInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(this.getLogInterceptor()).addPathPatterns("/category/*");
    }
}
