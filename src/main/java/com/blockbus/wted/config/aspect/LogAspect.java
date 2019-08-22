package com.blockbus.wted.config.aspect;


import com.blockbus.wted.config.annotation.LogAnnotation;
import com.blockbus.wted.config.exception.BusinessException;
import com.blockbus.wted.core.user.dto.BaseDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

@Aspect
@Component
public class LogAspect {

    private Logger LOGGER = LoggerFactory.getLogger(LogAspect.class);

    private static ObjectMapper objectMapper = new ObjectMapper();

    @Pointcut("execution(* com.blockbus.wted.core.user.controller.*.*.*(..))")
    public void controllerPoincut(){

    }

    @Around("controllerPoincut()")
    public Object around(ProceedingJoinPoint point){
        Object obj = null;
        try {
            obj = point.proceed();
            saveLog(point,obj);
        } catch (BusinessException busi) {
            saveErrorLog(point,busi.getMsg());
        }catch (Throwable throwable) {
            saveErrorLog(point,throwable);
        }
        return obj;
    }

    public void saveLog(JoinPoint point, Object result){

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        LOGGER.info("请求地址："+ request.getRequestURL());
        MethodSignature methodSignature = (MethodSignature) point.getSignature();
        Method method = methodSignature.getMethod();
        LOGGER.info("请求方法："+ method.getName());
        LogAnnotation logAnnotation = method.getAnnotation(LogAnnotation.class);
        if(logAnnotation != null){
            LOGGER.info("log注释：" + logAnnotation.value());
        }
        Object[] objs = point.getArgs();
        try {
            if(objs != null && objs.length>0){
                for(Object arg:point.getArgs()){
                    if(arg instanceof BaseDto){
                        LOGGER.info("方法参数："+ objectMapper.writeValueAsString(arg));
                    }
                }
            }

            if(result != null){
                String resultStr = objectMapper.writeValueAsString(result);
                int length = resultStr.length()>500?500:resultStr.length();
                LOGGER.info("返回结果："+ resultStr.substring(0,length)+"....");
            }
        } catch (JsonProcessingException e) {
            LOGGER.error("循环日志打印异常："+e.toString());
        }



    }

    public void saveErrorLog(ProceedingJoinPoint point, Object ex){
        LOGGER.info("捕获异常："+ex);
        this.saveLog(point,null);
    }
}
