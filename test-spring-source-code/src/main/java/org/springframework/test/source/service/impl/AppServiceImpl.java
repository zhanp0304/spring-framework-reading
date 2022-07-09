package org.springframework.test.source.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.test.source.service.AppService;

/**
 * Description
 *
 * @author zhanpeng.jiang@hand-china.com 2022/7/9
 */
public class AppServiceImpl implements AppService {

	protected final Log logger = LogFactory.getLog(getClass());

	@Override
	public void sayHi() {
		logger.info("hi, Spring");
	}
}
