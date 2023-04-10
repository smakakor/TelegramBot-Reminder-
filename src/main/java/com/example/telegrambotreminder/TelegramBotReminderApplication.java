package com.example.telegrambotreminder;

import jdk.jfr.Enabled;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TelegramBotReminderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TelegramBotReminderApplication.class, args);
    }

}
