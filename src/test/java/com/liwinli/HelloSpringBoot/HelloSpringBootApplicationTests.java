package com.liwinli.HelloSpringBoot;

import com.liwinli.HelloSpringBoot.controller.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;				//必须是static

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloSpringBootApplicationTests {

	@Test
	public void testSayHello() {
		assertEquals("Hello SB", new HelloController().index());
	}
}

