package com.benefitj.examples.config;

import com.alibaba.fastjson2.JSONObject;
import com.benefitj.core.IdUtils;
import com.benefitj.spring.mvc.BodyHttpServletRequestWrapper;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class BodyWrappedFilter extends OncePerRequestFilter {

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
    HttpMethod method = HttpMethod.resolve(request.getMethod());
    if (method == HttpMethod.POST || method == HttpMethod.PUT) {
      BodyHttpServletRequestWrapper wrap = BodyHttpServletRequestWrapper.wrap(request);
      JSONObject json = wrap.getStream().toJson();
      json.put("userId", IdUtils.uuid());
      wrap.setNewInput(json.toJSONString().getBytes(request.getCharacterEncoding()));
      filterChain.doFilter(wrap, response);
    } else {
      //request.getParameterMap().put("userId", new String[]{IdUtils.uuid()});
      filterChain.doFilter(request, response);
    }
  }

}
