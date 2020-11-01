package com.eg.lolapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LolApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LolApiApplication.class, args);
        System.out.println("http://localhost:5005/lol-api/page/championEnglishAndChinese");
    }

}
