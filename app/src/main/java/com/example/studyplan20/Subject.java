package com.example.studyplan20;

import java.util.List;

// Клас для предмету
public class Subject {
    String name;
    String time;
    // Конструктор, геттери, сеттери
}

// Клас для розкладу
class MySchedule {
    List<Subject> subjects;

    // Методи для додавання та видалення предметів
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void removeSubject(Subject subject) {
        subjects.remove(subject);
    }

    // Додаткові методи для роботи з розкладом
}

