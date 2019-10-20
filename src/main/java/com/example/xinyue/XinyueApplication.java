package com.example.xinyue;

import com.example.xinyue.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class XinyueApplication {

    public static void main(String[] args) {
        SpringApplication.run(XinyueApplication.class, args);
    }
}
