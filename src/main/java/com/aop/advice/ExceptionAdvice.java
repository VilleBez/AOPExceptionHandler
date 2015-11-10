package com.aop.advice;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionAdvice {
	private static Logger log = LoggerFactory.getLogger(ExceptionAdvice.class);

    public Object exceptionHandler(ProceedingJoinPoint proceedingJoinPoint) {
        Object value = null;

        try {
            value = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            log.info(proceedingJoinPoint.getSignature().getName() + " error");
            
            String errorMsg = "內部錯誤:" + e.getMessage();
            String errorCode = "500";
            
            Map<String, Object> resultMap = new HashMap<String, Object>();
            resultMap.put("successful", false);
            resultMap.put("errorCode", errorCode);
            resultMap.put("errorMsg", errorMsg );

            value = resultMap;
        }
        return value;
    }
}
