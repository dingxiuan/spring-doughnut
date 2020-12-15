package com.benefitj.mqttpublisher;

import com.benefitj.core.DateFmtter;
import com.benefitj.core.EventLoop;
import com.benefitj.spring.applicationevent.ApplicationEventListener;
import com.benefitj.spring.applicationevent.EnableApplicationListener;
import com.benefitj.spring.mqtt.MqttOptionsProperty;
import com.benefitj.spring.mqtt.MqttPublisher;
import com.benefitj.spring.mqtt.config.EnableMqttPublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * MQTT消息发布
 */
@EnableApplicationListener
@EnableMqttPublisher
@SpringBootApplication
public class MqttPublisherApplication {
  public static void main(String[] args) {
    SpringApplication.run(MqttPublisherApplication.class, args);
  }


  /**
   * 消息发布
   */
  @Slf4j
  @Component
  public static class PublisherTimer {

    private final EventLoop single = EventLoop.newSingle(false);

    @Autowired
    private MqttPublisher publisher;
    @Autowired
    private MqttOptionsProperty property;

    @ApplicationEventListener
    public void onApplicationReadyEvent(ApplicationReadyEvent applicationReadyEvent) {
      single.scheduleAtFixedRate(this::sendMqttMessage, 1, 5, TimeUnit.SECONDS);
    }

    private void sendMqttMessage() {
      try {
        String publishTopics = property.getPublishTopics();
        log.info("发布消息...");
        publisher.send(publishTopics + "010003b8", DateFmtter.fmtNowS());
      } catch (Exception e) {
        log.info("throw: {}", e.getMessage());
      }
    }
  }
}
