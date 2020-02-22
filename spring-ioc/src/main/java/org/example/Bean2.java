package org.example;

public class Bean2 extends User {
    private Integer score;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Bean2{" +
                "score=" + score + super.toString() +
                '}';
    }
}
