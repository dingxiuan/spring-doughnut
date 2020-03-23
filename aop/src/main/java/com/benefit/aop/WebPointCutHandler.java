package com.benefit.aop;

import org.aspectj.lang.JoinPoint;
import org.springframework.lang.Nullable;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface WebPointCutHandler {

  default void doBefore(JoinPoint joinPoint) {
  }

  default void doAfterReturning(JoinPoint joinPoint, Object returnValue) {
  }

  default void doAfterThrowing(JoinPoint joinPoint, Throwable ex) {
  }

  default void doAfter(JoinPoint joinPoint) {
  }

  @Nullable
  default ServletRequestAttributes getRequestAttributes() {
    return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes());
  }

  @Nullable
  default HttpServletRequest getRequest() {
    ServletRequestAttributes attrs = getRequestAttributes();
    return attrs != null ? attrs.getRequest() : null;
  }

  @Nullable
  default HttpServletResponse getResponse() {
    ServletRequestAttributes attrs = getRequestAttributes();
    return attrs != null ? attrs.getResponse() : null;
  }

}
