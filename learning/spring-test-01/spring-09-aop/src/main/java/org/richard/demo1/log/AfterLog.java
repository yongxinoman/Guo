package org.richard.demo1.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {

        System.out.println(o.getClass().getName()+"的"+method.getName()+"被执行");
    }
}
