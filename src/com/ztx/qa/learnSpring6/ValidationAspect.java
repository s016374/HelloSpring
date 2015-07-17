package com.ztx.qa.learnSpring6;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by s016374 on 15/7/16.
 */
@Component
@Aspect
@Order(1)
public class ValidationAspect {
    @Before("LogginAspect.joinPointExpression()")
    public void validationMethod(JoinPoint joinPoint) {
        System.out.println("validationMethod...methodName:[" + joinPoint.getSignature().getName() + "],args:" + Arrays.asList(joinPoint.getArgs()));
    }
}
