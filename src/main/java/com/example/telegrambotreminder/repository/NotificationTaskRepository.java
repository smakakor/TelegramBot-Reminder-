package com.example.telegrambotreminder.repository;

import com.example.telegrambotreminder.entity.NotificationTask;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationTaskRepository extends JpaRepository<NotificationTask,Long> {

    List<NotificationTask> findAllByNotificationDateTime(LocalDateTime localDateTime);
}
