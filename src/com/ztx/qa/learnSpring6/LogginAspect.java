package com.ztx.qa.learnSpring6;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by s016374 on 15/7/15.
 */
@Component
@Aspect
public class LogginAspect {
    @Before("execution(* com.ztx.qa.learnSpring6.Calculator.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("beforeMethod...methodName:[" + methodName + "],args:" + args);
    }
}
