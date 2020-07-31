package com.company.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author: kaichenkai
 * @create: 7/31/2020 14:48
 */
@Aspect//注解表示这是一个切面
@Component//表示这是一个bean,由Spring进行管理
public class LoggerAspect {

    @Around(value = "execution(* com.company.service.ProductService.*(..))")//表示对com.company.service.ProductService 这个类中的所有方法进行切面操作
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("start log:" + joinPoint.getSignature());
        Object resultObj = joinPoint.proceed();
        System.out.println("end log:" + joinPoint.getSignature());
        return resultObj;
    }
}
