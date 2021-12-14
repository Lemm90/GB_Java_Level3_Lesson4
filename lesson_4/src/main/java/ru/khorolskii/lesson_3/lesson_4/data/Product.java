package ru.khorolskii.lesson_3.lesson_4.data;

public class Product {
    private Long id;
    private String name;
    private Integer score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Product() {
    }

    public Product(Long id, String name, Integer score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
}
