package com.example.howtodoinjava.hellodocker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertTrue;

import com.example.howtodoinjava.hellodocker.HelloDockerRestController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloDockerApplicationTests {

	@Test
	public void contextLoads() {		
		System.out.println("Inside contextLoads()");
		HelloDockerRestController helloDockerRestController = new HelloDockerRestController();
		helloDockerRestController.helloDocker("Test Case is executed.");
		assertTrue("message", true);
	  }

	@Test
    public void shouldAnswerWithTrue()
    {
		System.out.println("Inside shouldAnswerWithTrue()");
		HelloDockerRestController helloDockerRestController = new HelloDockerRestController();
		helloDockerRestController.helloDocker("Test Case is executed.");
        assertTrue( true );
    }
}