package org.mengyun.tcctransaction.spring;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncAnnotationBeanPostProcessor;
import org.springframework.scheduling.annotation.EnableAsync;

@AutoConfigureAfter(TccTransactionAutoConfiguration.class)
@ConditionalOnMissingBean(AsyncAnnotationBeanPostProcessor.class)
@EnableAsync
@Configuration
public class ScheduleConfiguration {

}
