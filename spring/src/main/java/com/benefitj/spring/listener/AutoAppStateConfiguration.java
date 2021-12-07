package com.benefitj.spring.listener;


import com.benefitj.spring.annotationprcoessor.AnnotationBeanProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * APP状态注解配置
 */
@Configuration
public class AutoAppStateConfiguration {

  @Bean
  public AppStateEventAdapter appStateEventAdapter(@Autowired(required = false)
                                                       List<AppStateListener> listeners) {
    return new AppStateEventAdapter(listeners);
  }

  /**
   * 注解元信息处理器
   */
  @Bean
  public AppStateMetadataHandler appStateMetadataHandler() {
    return new AppStateMetadataHandler();
  }

  /**
   * OnAppStart
   */
  @Bean
  public AnnotationBeanProcessor onAppStartProcessor(AppStateMetadataHandler handler) {
    AnnotationBeanProcessor processor = new AnnotationBeanProcessor();
    processor.setAnnotationType(OnAppStart.class);
    processor.setMetadataHandler(handler);
    return processor;
  }

  /**
   * OnAppStop
   */
  @Bean
  public AnnotationBeanProcessor onAppStopProcessor(AppStateMetadataHandler handler) {
    AnnotationBeanProcessor processor = new AnnotationBeanProcessor();
    processor.setAnnotationType(OnAppStop.class);
    processor.setMetadataHandler(handler);
    return processor;
  }

}