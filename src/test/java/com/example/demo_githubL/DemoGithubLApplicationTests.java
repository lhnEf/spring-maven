package com.example.demo_githubL;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
class DemoGithubLApplicationTests {

	@Test
	void contextLoads() {
	}

}

@RestController

class HelloWorldController {

	@GetMapping("/")

	public String sayHello() {

		return "Hello, World Lehna";

	}

}
 
