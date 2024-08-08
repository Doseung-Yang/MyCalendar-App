package com.example.calendarapp.event;

import java.time.ZonedDateTime;

public class Todo extends AbstractEvent {

    private String description;

    public Todo(int id, String title,
                   ZonedDateTime startAt, ZonedDateTime endAt,
                String description) {
        super(id, title, startAt, endAt);
        this.description = description;
    }

    @Override
    public void print() {
        System.out.printf("[할 일] %s : %s%n", getTitle(), getTitle(), description);
    }
}
