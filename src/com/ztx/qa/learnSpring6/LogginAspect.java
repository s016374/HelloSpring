package com.ztx.qa.learnSpring6;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by s016374 on 15/7/15.
 */
@Component
@Aspect
@Order(2)
public class LogginAspect {
    @Pointcut("execution(* com.ztx.qa.learnSpring6.Calculator.*(..))")
    public void joinPointExpression() {

    }

    @Before("execution(* com.ztx.qa.learnSpring6.Calculator.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("beforeMethod...methodName:[" + methodName + "],args:" + args);
    }

    @After("execution(* com.ztx.qa.learnSpring6.Calculator.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("afterMethod...methodName:[" + methodName + "],end.");
    }

    @AfterReturning(value = "execution(* com.ztx.qa.learnSpring6.Calculator.*(..))", returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("afterReturningMethod...methodName:[" + methodName + "],args:" + args + ",result:[" + result + "].");
    }

    @AfterThrowing(value = "execution(* com.ztx.qa.learnSpring6.Calculator.*(..))", throwing = "exception")
    public void afterThrowingMethod(JoinPoint joinPoint, Exception exception) {
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("afterThrowingMethod...methodName:[" + methodName + "],args:" + args + ",execption:[" + exception + "].");
    }

    @Around("joinPointExpression()")
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) {
        Object result = null;
        String methodName = proceedingJoinPoint.getSignature().getName();

        try {
            /*前置通知*/
            System.out.println("aroundMethod...methodName:[" + methodName + "],args:" + Arrays.asList(proceedingJoinPoint.getArgs()));
            result = proceedingJoinPoint.proceed();
            /*后置返回通知*/
            System.out.println("aroundMethod...methodName:[" + methodName + "],args:" + Arrays.asList(proceedingJoinPoint.getArgs()) + ",result:[" + result + "].");
        } catch (Throwable throwable) {
            /*后置异常通知*/
            System.out.println("aroundMethod...methodName:[" + methodName + "],args:" + Arrays.asList(proceedingJoinPoint.getArgs()) + ",execption:[" + throwable + "].");
            throwable.printStackTrace();
        }
        /*后置通知*/
        System.out.println("aroundMethod...methodName:[" + methodName + "],end.");

        return result;
    }
}
