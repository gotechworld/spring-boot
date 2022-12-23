package com.example.springbootexample;

public class SpringBootExampleTest {
    
    public void test() {
        SpringBootExampleController controller = new SpringBootExampleController();
        String result = controller.index();
        assert result.equals("Greetings from Spring Boot!");
    }

    
}
