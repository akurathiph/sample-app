package com.mphasis.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() throws Exception {
		logger.info("Say Hello");
		return "Hello Everyone!!!";

	}


}
