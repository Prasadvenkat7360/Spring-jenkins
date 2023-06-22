package com.example.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	public  static org.slf4j.Logger logger=org.slf4j.LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("test case excuting");
		assertEquals(true, true);
	}

}
