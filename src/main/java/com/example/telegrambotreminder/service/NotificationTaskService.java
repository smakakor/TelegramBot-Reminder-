package com.example.telegrambotreminder.service;

import com.example.telegrambotreminder.entity.NotificationTask;
import com.example.telegrambotreminder.repository.NotificationTaskRepository;
import org.springframework.stereotype.Service;

@Service
public class NotificationTaskService {
    private final NotificationTaskRepository notificationTaskRepository;

    public NotificationTaskService(NotificationTaskRepository notificationTaskRepository) {
        this.notificationTaskRepository = notificationTaskRepository;
    }

    public void save(NotificationTask notificationTask) {
        notificationTaskRepository.save(notificationTask);
    }

}
