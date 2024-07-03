package com.logikio.webassignment;

import com.logikio.webassignment.controller.MessageController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = {WebassignmentApplication.class})
class WebassignmentApplicationTests {

	@Autowired
	private MessageController messageController;

	@Test
	public void contextLoads() throws Exception {
		assertThat(messageController).isNotNull();
	}

}
