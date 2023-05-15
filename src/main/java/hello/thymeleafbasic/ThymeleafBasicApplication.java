package hello.thymeleafbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = "hello"
)
public class ThymeleafBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafBasicApplication.class, args);
    }

}
