package br.com.jozias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class ApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }

}
