package com.k8scrontest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@EnableScheduling
@SpringBootApplication
public class K8sCronTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sCronTestApplication.class, args);
    }

    @Scheduled(cron = "${test.cron}")
    public void printMessage() {
        LocalTime currentTime = LocalTime.now();
        String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Current time: " + formattedTime);
    }

}
