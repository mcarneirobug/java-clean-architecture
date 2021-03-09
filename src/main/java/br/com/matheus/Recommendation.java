package br.com.matheus;

import java.time.LocalDateTime;

public class Recommendation {

    private Student indicated;

    private Student indicator;

    private LocalDateTime createdAt;

    public Recommendation(Student indicated, Student indicator) {
        this.indicated = indicated;
        this.indicator = indicator;
        this.createdAt = LocalDateTime.now();
    }

    public Student getIndicated() {
        return indicated;
    }

    public Student getIndicator() {
        return indicator;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
