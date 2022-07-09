package org.springframework.test.source.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.source.service.AppService;
import org.springframework.test.source.service.impl.AppServiceImpl;

/**
 * 配置类
 *
 * @author zhanpeng.jiang@hand-china.com 2022/7/9
 */
@Configuration
public class AppConfig {
	@Bean
	public AppService appService() {
		return new AppServiceImpl();
	}
}
