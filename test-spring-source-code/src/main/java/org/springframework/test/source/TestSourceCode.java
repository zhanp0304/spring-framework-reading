package org.springframework.test.source;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.source.config.AppConfig;
import org.springframework.test.source.service.AppService;

/**
 * 测试源码
 *
 * @author zhanpeng.jiang@hand-china.com 2022/7/9
 */
public class TestSourceCode {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		AppService appService = annotationContext.getBean(AppService.class);
		appService.sayHi();
	}
}
