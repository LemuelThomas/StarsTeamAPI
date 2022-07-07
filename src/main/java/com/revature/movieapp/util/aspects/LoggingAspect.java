package com.revature.movieapp.util.aspects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {
    private final Logger logger = LogManager.getLogger();

    @Pointcut("within(com.revature.movieapp..*)")
    public void logAll() {

    }

    @Before(value = "logAll()")
    public void startLog(JoinPoint jp) {
        String methodSig = extractMethodSignature(jp);
        String methodArgs = Arrays.toString(jp.getArgs());
        logger.info("{} invoked with the following arguments {}", methodSig, methodArgs);
    }

    @AfterReturning(value = "logAll()", returning = "returnedObject")
    public void returnLog(JoinPoint jp, Object returnedObject) {
        String methodSig = extractMethodSignature(jp);
        logger.info("{} successfully returned with the value: {}", methodSig, returnedObject);
    }

    @AfterThrowing(value = "logAll()", throwing = "t")
    public void exceptionLog( JoinPoint jp, Throwable t) {
        String methodSig = extractMethodSignature(jp);
        String exceptionName = t.getClass().getSimpleName();
        logger.warn("{} was thrown in method {} whith the message \"{}\"", exceptionName, methodSig, t.getMessage());
    }

    private String extractMethodSignature(JoinPoint jp) {
        return jp.getTarget().getClass().getSimpleName() + "#" + jp.getSignature().getName();
    }
}
