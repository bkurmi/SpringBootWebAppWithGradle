package com.jcombat.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

    @Aspect
    @Component
    public class ExampleAspect {
        @Before(value = "execution(* com.jcombat.controller.DemoController.*(..))")
        public void beforeAdvice(JoinPoint joinPoint) {
            System.out.println("Before method:" + joinPoint.getSignature());
        }

        @After(value = "execution(* com.jcombat.controller.DemoController.*(..))")
        public void afterAdvice(JoinPoint joinPoint) {
            System.out.println("After method:" + joinPoint.getSignature());
        }
    }